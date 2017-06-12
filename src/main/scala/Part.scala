import scala.util.Random

/**
  * Created by Administrator on 12/06/2017.
  */
class Part(partN : String) {
  val partName = partN
  var isBroke = Random.nextBoolean()

  def timeAndCost(): (Int, Double) = partName match {
    case "Suspension" => (90, 40.00)
    case "Engine" => (140, 150.00)
    case "Fuel Tank" => (50, 55.00)
    case "Doors" => (60, 75.00)
    case "Gearbox" => (70, 70.00)
    case "Window" => (20, 25.00)
    case "Brakes" => (100, 75.00)
    case "Radiator" => (70, 60.00)
    case "Catalytic Converter" => (75, 90.00)
    case "Steering" => (65, 75.00)
    case _ => (0, 0.00)
  }
}

object Part {
  def apply(partN: String): Part = new Part(partN)
}
