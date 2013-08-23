import scala.io.Source
def wordCounter(phrase: String): Integer =  phrase.filter(_ == ' ').size + 1
val source = Source.fromFile("IO/lorem_ipsum")
var total: Integer = 0
for (line <- source.getLines())
  total += wordCounter(line)
println(total)
