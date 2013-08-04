def pignizer(word: String):String = {
  val latinizer: String = (new StringBuilder(word.splitAt(1)._1)) + "ay"
  val dividedWord: StringBuilder = new StringBuilder(word.splitAt(1)._2)
  dividedWord + latinizer
}
println("Enter a word to be converted to pig latin")
println(pignizer(readLine()))
