import scala.reflect.runtime.universe._
import scala.util.matching.Regex

val whiteListOperators = List[String]("+","-","/","%")
val numbersMatcher: Regex = new Regex("\\d+")
val operatorMatcher: Regex = {
  new Regex(whiteListOperators.map('\\' + _).mkString("|"))
}

println("Insert an expression for the calculator (e.g. '1 + 1' )")
val input: String = readLine()

val firstNumbers: Int = numbersMatcher.findAllIn(input).toList(0).toInt
val lastNumbers: Int = numbersMatcher.findAllIn(input).toList(1).toInt
val operatorAtString: String = operatorMatcher.findAllIn(input).toList(0).toString

  
//Experimental reflection
val op = typeOf[Int].declaration(newTermName("/").encodedName).asTerm.alternatives(1)//returns / method
runtimeMirror(getClass.getClassLoader).reflect(10).reflectMethod(op.asMethod)(2)//returns 5
