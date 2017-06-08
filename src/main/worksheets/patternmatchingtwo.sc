def swapIntegerPair(pair : Any): Any = pair match {
  case list @ List(i, j) => List(j, i)
  case array @ Array(i, j) => Array(j, i)
  case (i, j) => (j, i)
  case collect : Seq[Int] if collect.size > 2 => swapIntegerPair(collect.take(2))
  case _ => "Not a valid type."
}

swapIntegerPair(List(5, 3))
swapIntegerPair(Array(10, 7))
swapIntegerPair((15, 13))
swapIntegerPair(List(11, 9, 4, 9))