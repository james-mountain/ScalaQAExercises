/**
  * Created by Administrator on 08/06/2017.
  */
abstract class Person() {
  val firstName : String
  val lastName : String
  val phoneNumber : String

  def enterGarage(garage: Garage) = garage.open match {
    case true => garage.peopleInGarage.append(this)
    case false => println(this, " tried to enter garage, but it is not open.")
  }
}
