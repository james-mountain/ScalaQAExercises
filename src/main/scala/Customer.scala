/**
  * Created by Administrator on 08/06/2017.
  */
class Customer(fName: String, lName: String, pNumber: String, vehicles: List[Vehicle]) extends Person(fName, lName, pNumber) {
  val ownedVehicles : List[Vehicle] = vehicles

  override def toString: String = s"Garage Customer - $firstName $lastName ($phoneNumber) - $ownedVehicles"
}
