/**
  * Created by Administrator on 08/06/2017.
  */
class Car(modelN: String, regist: String) extends Vehicle {
  val registration = regist
  val modelName = modelN
  val parts = List("Suspension", "Engine", "Fuel Tank", "Doors", "Gearbox", "Window", "Brakes", "Radiator", "Catalytic Converter", "Steering").map(part => Part(part))
  override var repairedBy: Option[Employee] = None

  override def toString: String = "Car - Model: %s, Registration: %s".format(modelName, registration)
}
