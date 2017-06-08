def recurseOutputStringSeveralTimes(inputString : String, remain: Int): Unit = {
  if (remain != 0) {
    println(inputString);
    recurseOutputStringSeveralTimes(inputString, remain - 1)
  }
}
recurseOutputStringSeveralTimes("Hello", 4)

def rectangleLine(inputString : String, remain: Int): Unit = {
  if (remain != 0) {
    print(inputString);
    rectangleLine(inputString, remain - 1)
  } else {
    print("\n");
  }
}

def recurseOutputRectangleSeveralTimes(inputString : String, remain: Int, printNum : Int): Unit = {
  if (remain != 0) {
    rectangleLine(inputString, printNum)
    recurseOutputRectangleSeveralTimes(inputString, remain - 1, printNum)
  }
}

def recurseRectangleOutput(inputString : String, remain: Int): Unit = {
  recurseOutputRectangleSeveralTimes(inputString, remain, remain)
}
recurseRectangleOutput("Test", 5)

def recurseFizzBuzz(fizzString : String, buzzString : String, remain : Int, endIteration : Int): Unit = {
  if (remain != 0) {
    val num = endIteration - remain + 1;
    if (num % 3 == 0) {
      print(fizzString)
    }
    if (num % 5 == 0) {
      print(buzzString)
    }
    if (num % 3 != 0 && num % 5 != 0) {
      print(num)
    }

    print(",")
    recurseFizzBuzz(fizzString, buzzString, remain - 1, endIteration)
  }
}

def fizzBuzz(fizzString : String, buzzString : String, remain : Int): Unit = {
  recurseFizzBuzz(fizzString, buzzString, remain, remain)
}
fizzBuzz("Fizz", "Buzz", 15)