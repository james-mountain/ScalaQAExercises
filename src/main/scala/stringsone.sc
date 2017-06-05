def charsFromEndOfString(inputString : String, splitPoint : Int): String = {
  var endString = ""
  for (i <- inputString.length() to inputString.length()-splitPoint+1 by -1) {
    endString += inputString.charAt(i-1)
  }

  endString.reverse
}

charsFromEndOfString("Hello", 3)