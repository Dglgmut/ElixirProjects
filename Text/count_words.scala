import scala.io.Source
def wordCounter(phrase: String): Integer =  phrase.filter(_ == ' ').size + 1
val source = Source.fromFile("IO/lorem_ipsum")
