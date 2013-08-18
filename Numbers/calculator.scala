import scala.reflect.runtime.universe._
import scala.util.matching.Regex

val whiteListOperators = List[String]("+","-","/","%")
println("Insert an expression for the calculator (e.g. '1 + 1' )")

//Experimental reflection
val op = typeOf[Int].declaration(newTermName("/").encodedName).asTerm.alternatives(1)//returns / method
runtimeMirror(getClass.getClassLoader).reflect(10).reflectMethod(op.asMethod)(2)//returns 5
