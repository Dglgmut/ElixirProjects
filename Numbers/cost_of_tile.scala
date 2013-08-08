def multiplyArgs(argsRange: Range): Int = {
  if(argsRange.length > 0)
    args(argsRange(0)).toInt * multiplyArgs(argsRange.tail)
  else
    1
}
try {
  println(multiplyArgs(0 to 2))
} catch {
  case e: ArrayIndexOutOfBoundsException => println("Enter the inputs in  the following order: Price Height Width")
}
