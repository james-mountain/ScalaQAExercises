/**
  * Created by Administrator on 08/06/2017.
  */
class Customer(fName: String, lName: String, pNumber: String, vecs: List[Vehicle]) extends Person {
  override val firstName: String = fName
  override val lastName: String = lName
  override val phoneNumber: String = pNumber
  val vehicles = vecs

  def makeBooking(garage : Garage) = {
    garage.queue ++= vehicles
  }

  override def toString: String = s"Garage Customer - $firstName $lastName ($phoneNumber) - $vehicles"
}
