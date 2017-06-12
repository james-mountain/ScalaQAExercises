/**
  * Created by Administrator on 08/06/2017.
  */
class Employee(fName: String, lName: String, pNumber: String, erole: String) extends Person {
  override val firstName: String = fName
  override val lastName: String = lName
  override val phoneNumber: String = pNumber
  val role = erole
  var timeAvailable = 0

  override def enterGarage(garage: Garage) = garage.peopleInGarage.append(this)
  override def toString: String = s"Garage Employee - $firstName $lastName ($phoneNumber) - Role: $role"
}
