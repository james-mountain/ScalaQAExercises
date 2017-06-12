/**
  * Created by Administrator on 08/06/2017.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val garage = new Garage()
    val adam = new Customer("Adam", "Jones", "01522 451416", List(new Car("Fiat Panda", "NG6T R35"), new Car("Golf", "NGX5 D15")))
    adam.makeBooking(garage)

    val john = new Employee("John", "Smith", "01234 567890", "Chief Mechanic")
    garage.registerEmployee(john)
    john.enterGarage(garage)

    garage.openGarage()

    print("\n" + garage.toString)
  }
}