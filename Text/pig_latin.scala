//TODO: implement consonant cluster logic
object Pig {
  private val vowels: List[Char] = List[Char]('a','e','i','o','u')
  private val consonants: List[Char] = ('a' to 'z').toList diff vowels

  private def startsWithConsonant(word: String): Boolean = consonants.contains(word(0))
  private def startsWithY(word: String): Boolean = word(0) == ('y')
  private def dividedWord(word: String): String = new StringBuilder(word.splitAt(1)._2) + word(0).toString + "ay"

  def latinizer(word: String): String = {
      if(startsWithConsonant(word) || startsWithY(word))
        dividedWord(word)
      else //starts with a vowel
        (new StringBuilder(word)) + "way"
                
  }
}

println("Enter a word to be converted to pig latin")
println(Pig.latinizer(readLine()))
