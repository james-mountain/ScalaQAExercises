def operateOnIntegers(intOne : Int, intTwo : Int, perfAddition : Boolean): Int = {
  if (perfAddition) intOne + intTwo else intOne * intTwo;
}

operateOnIntegers(3, 5, true);
operateOnIntegers(3, 5, false);