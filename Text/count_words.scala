println("Enter a phrase to count its words")
val phrase: String = readLine()
def wordCounter(phrase: String): Integer =  phrase.filter(_ == ' ').size + 1
