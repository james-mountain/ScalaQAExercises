import scala.collection.mutable

def readFileIntoArray(fileName : String) : Array[String] = {
  scala.io.Source.fromFile(fileName).getLines().toArray
}

def sortStringByAlphabet(strinput : String) : String = {
  strinput.sortWith(_ < _)
}

def makeAnagramHashmap(inputStrings: Array[String]) : mutable.HashMap[String, Array[String]] = {
  val hashmap = new mutable.HashMap[String, Array[String]]()
  inputStrings.foreach(inputString => {
    val soristr = sortStringByAlphabet(inputString)
    if (hashmap contains soristr) {
      hashmap(soristr) = inputString +: hashmap(soristr)
    } else {
      hashmap(soristr) = Array(inputString)
    }
  })

  hashmap
}

val anagrammap = makeAnagramHashmap(readFileIntoArray("C:/test.txt"))
anagrammap.foreach {case (base, anagrams) => printf("Base: %s - Anagrams: %s\n", base, anagrams.mkString(" "))}

val largcount = anagrammap(anagrammap.maxBy { case (k,v) => v.length }._1).length
val topmaps = anagrammap.retain((k,v) => v.length == largcount)
val longmap = topmaps.maxBy { case (k,v) => k.length }
val longcount = longmap._1.length
val finalmap = anagrammap.retain((k,v) => k.length == longcount)