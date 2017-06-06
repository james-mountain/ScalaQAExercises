def uniqueSum(num1 : Int, num2 : Int, num3 : Int): Int = {
  val inputs = List(num1, num2, num3)
  var sum = 0;
  for (input <- inputs) {
    if (inputs.count(x => x == input) == 1) {
      sum += input;
    }
  }

  sum
}

uniqueSum(1, 2, 3)
uniqueSum(3, 3, 3)
uniqueSum(1, 1, 2)