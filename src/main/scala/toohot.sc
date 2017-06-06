def tooHot(temperature: Int, summer: Boolean): Boolean = (temperature, summer) match {
  case (temp, sum) if temp >= 60 && temp <= (sum match {
    case true => 100
    case false => 90
  }) => true
  case _ => false
}

tooHot(80, false)
tooHot(100, false)
tooHot(100, true)