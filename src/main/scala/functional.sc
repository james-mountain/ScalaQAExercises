val arraybuffer = scala.collection.mutable.ArrayBuffer.empty[String]
java.util.TimeZone.getAvailableIDs.foreach(arraybuffer += _.split("/")(0))
arraybuffer