/*
  This problem is solved using Scala's language elements, without
  any math algorithm for simplicity's sake.
*/
import scala.math.Pi

println("Enter the number of digits that you wish to round from PI")
val input = readLine()
try {
  println(Pi.toString.substring(0, input.toInt))
} catch {
  case e:java.lang.StringIndexOutOfBoundsException => println("The digit that you want is out of bound")
}
