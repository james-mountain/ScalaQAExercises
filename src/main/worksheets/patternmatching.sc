def operateOnIntegers(intOne : Int, intTwo : Int, perfAddition : Boolean): Int = {
  perfAddition match {
    case true => intOne + intTwo
    case false => intOne * intTwo
  }
}
operateOnIntegers(3, 5, true);
operateOnIntegers(3, 5, false);

def operateOnIntegersZero(intOne : Int, intTwo : Int, perfAddition : Boolean): Int = {
  val defRes = perfAddition match {
    case true => intOne + intTwo
    case false => intOne * intTwo
  }

  intOne match {
    case 0 => intTwo
    case _ => defRes
  }

  intTwo match {
    case 0 => intOne
    case _ => defRes
  }
}

operateOnIntegersZero(0, 12, true);
operateOnIntegersZero(16, 0, false);
operateOnIntegersZero(3, 5, true);
operateOnIntegersZero(3, 5, false);