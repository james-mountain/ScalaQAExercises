def operateOnIntegers(intOne : Int, intTwo : Int, perfAddition : Boolean): Int = {
  if (intOne == 0) {
    return intTwo;
  } else if (intTwo == 0) {
    return intOne;
  }

  return if (perfAddition) intOne + intTwo else intOne * intTwo;
}

operateOnIntegers(0, 12, true);
operateOnIntegers(16, 0, false);
operateOnIntegers(3, 5, true);
operateOnIntegers(3, 5, false);