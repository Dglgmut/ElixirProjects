import scala.reflect.runtime.universe._
import scala.util.matching.Regex

val whiteListOperators = List[String]("+","-","/","%")
val numbersMatcher: Regex = new Regex("\\d+")
val operatorMatcher: Regex = {
  new Regex(whiteListOperators.map('\\' + _).mkString("|"))
}

println("Insert an expression for the calculator (e.g. '1 + 1' )")
val input: String = readLine()

val firstNumber: Int = numbersMatcher.findAllIn(input).toList(0).toInt
val lastNumber: Int = numbersMatcher.findAllIn(input).toList(1).toInt
val operatorAtString: String = operatorMatcher.findAllIn(input).toList(0).toString

  
//Working reflection <3
val op =typeOf[Int].declaration(newTermName(operatorAtString).encodedName).asTerm.alternatives(1) // 0 makes the operator behave like string, 1 makes it behave like a number
val result = runtimeMirror(getClass.getClassLoader).reflect(firstNumber).reflectMethod(op.asMethod)(lastNumber)
println(result)
