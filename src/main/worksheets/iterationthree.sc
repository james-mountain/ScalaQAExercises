def fizzBuzz(fizzString : String, buzzString : String, endIteration : Int) = {
  for (i <- 1 to endIteration) {
    if (i % 3 == 0) {
      print(fizzString)
    }
    if (i % 5 == 0) {
      print(buzzString)
    }
    if (i % 3 != 0 && i % 5 != 0) {
      print(i)
    }

    print(",")
  }
}

fizzBuzz("Fizz", "Buzz", 15)