def outputStringSeveralTimes(inputString : String, times : Int) = {
  for (i <- 1 to times) {
    println(inputString)
  }
}
outputStringSeveralTimes("Hi", 3)