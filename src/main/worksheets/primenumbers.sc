def determinePrimeNumbers(amount: Int) : Int = {
  val isPrime = Array.fill(amount)(true)

  for (i <- 2 to scala.math.sqrt(amount).toInt if isPrime(i)) {
    for (j <- i * i until amount by i) {
      isPrime(j) = false
    }
  }

  isPrime.count(x => x)
}
determinePrimeNumbers(2000000000)