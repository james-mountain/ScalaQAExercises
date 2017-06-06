import scala.collection.mutable

def readFileIntoArray(fileName : String) : Array[String] = {
  scala.io.Source.fromFile(fileName).getLines().toArray
}

def sortStringByAlphabet(strinput : String) : String = {
  strinput.sortWith(_ < _)
}

def makeAnagramHashmap(inputStrings: Array[String]) : mutable.HashMap[String, Array[String]] = {
  val hashmap = new mutable.HashMap[String, Array[String]]()
  for (inpstr <- inputStrings) {
    val soristr = sortStringByAlphabet(inpstr)
    if (hashmap contains soristr) {
      hashmap(soristr) = inpstr +: hashmap(soristr)
    } else {
      hashmap(soristr) = Array(inpstr)
    }
  }

  hashmap
}

val anagrammap = makeAnagramHashmap(readFileIntoArray("C:/test.txt"))
for ((base, anagrams) <- anagrammap) {
  printf("Base: %s - Anagrams: %s\n", base, anagrams.mkString(" "))
}

val largcount = anagrammap(anagrammap.maxBy { case (k,v) => v.length }._1).length
val topmaps = anagrammap.retain((k,v) => v.length == largcount)
val longmap = topmaps.maxBy { case (k,v) => k.length }
val longcount = longmap._1.length
val finalmap = anagrammap.retain((k,v) => k.length == longcount)