val morseMap = Map(
  ".-" -> "a",
  "-..." -> "b",
  "-.-." -> "c",
  "-.." -> "d",
  "." -> "e",
  "..-." -> "f",
  "--." -> "g",
  "...." -> "h",
  ".." -> "i",
  ".---" -> "j",
  "-.-" -> "k",
  ".-.." -> "l",
  "--" -> "m",
  "-." -> "n",
  "---" -> "o",
  ".--." -> "p",
  "--.-" -> "q",
  ".-." -> "r",
  "..." -> "s",
  "-" -> "t",
  "..-" -> "u",
  ".--" -> "w",
  "-..-" -> "x",
  "-.--" -> "y",
  "--.." -> "z",
  "/" -> " "
)
val reverseMorseMap = morseMap.map(_.swap)
reverseMorseMap(" ")

def englishToMorse(englishStr : String): String = {
  englishStr.map(char => reverseMorseMap(char.toString) + " ").mkString("")
}

def morseWordToEnglish(morseWord : String) = {
  morseWord.split(" ").map(string => print(morseMap(string)))
  print(" ")
  Thread.sleep(200)
  java.awt.Toolkit.getDefaultToolkit.beep
}

def morseCodetoEnglish(morseCode : String) = {
  morseCode.split(" / ").foreach(morseWord => morseWordToEnglish(morseWord))
}

morseCodetoEnglish(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--")
englishToMorse("test hello world")