import scala.collection.mutable

def getStringSubsequences(strinput : String) : mutable.Set[String] = {
  val subsequences = mutable.Set[String]()
  for (i <- 0 until strinput.length; j <- i + 1 to strinput.length) {
    subsequences += strinput.slice(i, j)
  }

  subsequences
}

def longestCommonSubsequence(strone : String, strtwo : String) : String = {
  getStringSubsequences(strone).intersect(getStringSubsequences(strtwo)).maxBy(_.length)
}

longestCommonSubsequence("truckus", "firetruck")