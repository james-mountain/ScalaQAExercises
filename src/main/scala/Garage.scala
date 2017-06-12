import scala.collection.mutable.Queue
import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 08/06/2017.
  */
class Garage() {
  val garageCapacity = 7
  var parkedVehicles : ListBuffer[Vehicle] = ListBuffer.empty
  val peopleInGarage : ListBuffer[Person] = ListBuffer.empty
  val registeredEmployees : ListBuffer[Employee] = ListBuffer.empty
  val queue : Queue[Vehicle] = Queue.empty
  var open : Boolean = false

  def addVehicle(newVehicle: Vehicle) : Boolean = parkedVehicles.length match {
    case x if x < garageCapacity && open => parkedVehicles.append(newVehicle); true
    case _ => false
  }

  def removeVehicleByRegistration(vehicleRegis : String) = {
    parkedVehicles = parkedVehicles.filterNot(vehicle => vehicleRegis == vehicle.registration)
  }

  def removeVehicleByModel(vehicleModel : String) = {
    parkedVehicles = parkedVehicles.filterNot(vehicle => vehicleModel == vehicle.modelName)
  }

  def registerEmployee(employee: Employee) = {
    registeredEmployees.append(employee)
  }

  def getFreeEmployee(timesinceopen : Int) : Option[Employee] = {
    registeredEmployees.find(employee => peopleInGarage.contains(employee) && employee.timeAvailable <= timesinceopen)
  }

  def startFixVehicle(vehicle : Vehicle, employee: Employee, currentTime : Int) : (Int, Double) = {
    var timeToFix = 0
    var costToFix = 0.00

    if (parkedVehicles.contains(vehicle)) {
      for (part <- vehicle.parts if part.isBroke) {
        val timecost = part.timeAndCost()
        timeToFix += timecost._1; costToFix += timecost._2
      }

      employee.timeAvailable = currentTime + timeToFix
      vehicle.repairedBy = Option(employee)
      vehicle.repairStartTime = currentTime
    }

    (timeToFix, costToFix)
  }

  def calculateBill(vehicle: Vehicle) : Double = {
    var bill = 0.00
    vehicle.parts.foreach{
      case part if part.isBroke => bill += part.timeAndCost()._2
      case _ =>
    }
    bill;
  }

  def openGarage() = {
    open = true
    var timeSinceOpen = 0
    var totalEarnings = 0.00

    while ((!queue.isEmpty || !parkedVehicles.isEmpty)) {
      if (!queue.isEmpty && addVehicle(queue.front)) {
        val vehicle = queue.dequeue
        printf("New vehicle assessment: It will cost £%1.2f to fix the %s, which has %d broken parts.\n", calculateBill(vehicle), vehicle.modelName, vehicle.parts.count(part => part.isBroke))
      }

      def finishedVehicles = (vehicle: Vehicle) => !vehicle.finishedRepairs(timeSinceOpen)
      parkedVehicles.filterNot(finishedVehicles).
        foreach(vehicle => {
          totalEarnings += calculateBill(vehicle)
          printf("%s has fixed a %s. The cost was £%1.2f and it took %d minutes.\n", vehicle.repairedBy.get.firstName, vehicle.modelName, calculateBill(vehicle), timeSinceOpen - vehicle.repairStartTime)
        })
      parkedVehicles = parkedVehicles.filter(finishedVehicles)

      for (vehicle <- parkedVehicles) {
        val freeemployee = getFreeEmployee(timeSinceOpen)
        if (freeemployee.isDefined) {
          printf("%s is going to start fixing the %s at %d minutes from opening.\n", freeemployee.get.firstName, vehicle.modelName, timeSinceOpen)
          startFixVehicle(vehicle, freeemployee.get, timeSinceOpen)
        }
      }

      timeSinceOpen += 1;
    }

    println(f"The garage was open for a total of $timeSinceOpen%s minutes, and made £$totalEarnings%1.2f.")
  }
  def closeGarage() = open = false

  override def toString: String = s"Garage - Vehicles: $parkedVehicles\nPeople: $peopleInGarage\nEmployees: $registeredEmployees\nOpen: $open"
}
