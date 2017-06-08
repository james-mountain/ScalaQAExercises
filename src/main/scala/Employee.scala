/**
  * Created by Administrator on 08/06/2017.
  */
class Employee(fName: String, lName: String, pNumber: String, role: String) extends Person(fName, lName, pNumber) {
  val employeeRole : String = role

  override def toString: String = s"Garage Employee - $firstName $lastName ($phoneNumber) - Role: $employeeRole"
}
