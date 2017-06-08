import scala.collection.mutable.ListBuffer

/**
  * Created by Administrator on 08/06/2017.
  */
class Garage() {
  val garageCapacity = 7
  val parkedVehicles : ListBuffer[Vehicle] = ListBuffer.empty
  val peopleInGarage : ListBuffer[Person] = ListBuffer.empty
  val registeredEmployees : ListBuffer[Employee] = ListBuffer.empty
  val open : Boolean = false

  def addVehicleToGarage(newVehicle: Vehicle) : Boolean = parkedVehicles.length match {
    case x if x < garageCapacity => parkedVehicles.append(newVehicle); true
    case _ => false
  }

  override def toString: String = s"Garage - $parkedVehicles - $peopleInGarage - $registeredEmployees - Status: $open"
}
