def outputStringSeveralTimes(inputString : String, times : Int) = {
  for (i <- 1 to times; j <- 1 to times) {
    print(inputString)
    if (j % times == 0) {
      print("\n")
    }
  }
}
outputStringSeveralTimes("F", 7)