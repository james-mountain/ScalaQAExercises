/**
  * Created by Administrator on 08/06/2017.
  */
class Bike(modelN: String, regist: String) extends Vehicle(modelN, regist) {
  override def toString: String = s"Bike - Model: $modelName, Registration: $registration"
}
