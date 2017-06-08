def calculator(inputNumbers: Int*) = {
  val operations = Map(
    "+" -> {(x: Int, y: Int) => x + y },
    "-" -> {(x: Int, y: Int) => x - y },
    "/" -> {(x: Int, y: Int) => x / y },
    "*" -> {(x: Int, y: Int) => x * y })

  inputNumbers.foreach(goalResult => {
    var filtered = false
    val operands = inputNumbers.filter(operand => {
      if (!filtered) {
        filtered = operand == goalResult
        operand != goalResult
      } else true
    })
    operations.foreach{ case (symbol, func) =>
      var resultOfOperation = func(operands(0), operands(1))
      if (resultOfOperation == goalResult) printf("%d %s %d = %d\n", operands(0), symbol, operands(1), resultOfOperation)
      else {
        resultOfOperation = func(operands(1), operands(0))
        if (resultOfOperation == goalResult) printf("%d %s %d = %d\n", operands(1), symbol, operands(0), resultOfOperation)
      }
    }
  })
}

calculator(5, 3, 15)
calculator(4, 2, 8)
calculator(6, 2, 12)
calculator(6, 2, 3)
calculator(9, 12, 108)
calculator(4, 16, 64)