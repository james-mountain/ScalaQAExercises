def determinePrimeNumbers(amount: Int) : Int = {
  val isPrime : Array[Boolean] = new Array(amount)
  for (i <- 1 until amount) {
    isPrime(i) = true
  }

  for (i <- 2 to scala.math.sqrt(amount).toInt if isPrime(i)) {
    for (j <- i * i until amount by i) {
      isPrime(j) = false
    }
  }

  isPrime.count(x => x) - 1
}
determinePrimeNumbers(3000000)