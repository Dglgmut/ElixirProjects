import scala.io.Source

def wordCounter(phrase: String): Integer =  phrase.filter(_ == ' ').size + 1

println("Enter the path for a file")
val path = readLine()

val source = Source.fromFile(path)
var total: Integer = 0
for (line <- source.getLines())
  total += wordCounter(line)
println(total)
