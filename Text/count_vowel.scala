def countLetterAtString(phrase: String, letter: Char): Map[Char, Int] = {
  Map(letter -> phrase.toCharArray.filer{l => letter.exists(l == _)}.length)
}
println("Enter a string")
val vowel: List[Char] = List('a', 'e', 'i', 'o', 'u')
val input: String = readLine()
println(input.toCharArray.filter{l => vowel.exists(l == _)}.length)
