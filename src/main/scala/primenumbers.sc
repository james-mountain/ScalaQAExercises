def determinePrimeNumbers(amount: Int) : Int = {
  val isPrimeArray : Array[Boolean] = new Array(amount+1)
  for (i <- 1 to amount) {
    isPrimeArray(i) = true
  }

  for (i <- 2 to scala.math.sqrt(amount).toInt) {
    if (isPrimeArray(i)) {
      for (j <- i * i + (i-1)*i to amount) {
        isPrimeArray(j) = false
        println(j)
      }
    }
  }

  0
}
determinePrimeNumbers(10000)