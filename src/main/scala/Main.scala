/**
  * Created by Administrator on 08/06/2017.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val garage = new Garage()
    garage.addVehicleToGarage(new Car("Fiat Panda", "NG6T R35"))
    garage.addVehicleToGarage(new Car("Golf", "NGX5 D15"))
    garage.addVehicleToGarage(new Car("Corsa", "EA24 J91"))

    print(garage.toString)
  }
}