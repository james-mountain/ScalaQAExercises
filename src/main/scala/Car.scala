/**
  * Created by Administrator on 08/06/2017.
  */
class Car(modelN: String, regist: String) extends Vehicle(modelN, regist) {
  override def toString: String = s"Car - Model: $modelName, Registration: $registration"
}
