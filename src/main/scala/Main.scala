/**
  * Created by Administrator on 08/06/2017.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val garage = new Garage()
    val adam = new Customer("Adam", "Jones", "01522 451416", List(new Car("Fiat Panda", "NG6T R35"), new Car("Golf", "NGX5 D15")))
    val peter = new Customer("Peter", "Frederick", "01517 651226", List(new Car("Jeep", "NH6T R35")))

    adam.makeBooking(garage)
    peter.makeBooking(garage)

    val john = new Employee("John", "Smith", "01234 567890", "Chief Mechanic")
    val alex = new Employee("Alex", "Smith", "01666 776655", "Mechanic")
    garage.registerEmployee(john)
    garage.registerEmployee(alex)
    john.enterGarage(garage)
    alex.enterGarage(garage)

    garage.openGarage()

    print("\n" + garage.toString)
  }
}