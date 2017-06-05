def replaceAndJoinCharacters(firstPart: String, secondPart: String, toRep: Char, repWith: Char): String = {
  val newString = firstPart + secondPart
  newString.replace(toRep, repWith)
}

replaceAndJoinCharacters("Ha", "llo", 'a', 'e')