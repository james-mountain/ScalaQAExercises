def blackjack(value1 : Int, value2 : Int): Int = {
  (value1, value2) match {
    case (x, y) if x > 21 && y > 21 => 0
    case (x, y) if x <= 21 && x >= y => x
    case (x, y) if y <= 21 && y >= x => y
    case (x, y) if x <= 21 => x
    case (x, y) if y <= 21 => y
  }
}

blackjack(18, 21)
blackjack(20, 18)
blackjack(20, 22)
blackjack(22, 19)
blackjack(22, 22)