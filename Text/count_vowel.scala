def countLetterAtString(phrase: String, letter: Char): Map[Char, Int] =
  Map(letter -> phrase.filter(letter == _).length)

println("Enter a string")
val vowel: List[Char] = List('a', 'e', 'i', 'o', 'u')
val input: String = readLine()
vowel.foreach(v => println(countLetterAtString(input, v)))
