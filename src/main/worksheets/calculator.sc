def calculator(inputNumbers: Int*) = {
  val operations = Map("+" -> {(x: Int, y: Int) => x + y },
    "-" -> {(x: Int, y: Int) => x - y },
    "/" -> {(x: Int, y: Int) => x / y },
    "*" -> {(x: Int, y: Int) => x * y })

  inputNumbers.foreach(resultNum => {
    //println(resultNum, inputNumbers.filter(combinator => combinator != resultNum))
    val makernumbers = inputNumbers.filter(combinator => combinator != resultNum)
    //val tryresult =

    operations.foreach{ case (symbol, func) => {
      val result = func(makernumbers(0), makernumbers(1))
      if (result == resultNum) printf("%d %s %d = %d\n", makernumbers(0), symbol, makernumbers(1), result)
    }}
    operations.foreach{ case (symbol, func) => {
      val result = func(makernumbers(1), makernumbers(0))
      if (result == resultNum) printf("%d %s %d = %d\n", makernumbers(1), symbol, makernumbers(0), result)
    }}
  })
}

calculator(5, 3, 15)