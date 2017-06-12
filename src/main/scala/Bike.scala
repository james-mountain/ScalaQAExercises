/**
  * Created by Administrator on 08/06/2017.
  */
class Bike(modelN: String, regist: String) extends Vehicle {
  val registration = regist
  val modelName = modelN
  val parts = List("Suspension", "Engine", "Fuel Tank", "Doors", "Gearbox", "Window", "Brakes", "Radiator", "Catalytic Convertor", "Steering").map(part => Part(part))
  override var repairedBy: Option[Employee] = None

  override def toString: String = "Bike - Model: %s, Registration: %s".format(modelName, registration)
}
