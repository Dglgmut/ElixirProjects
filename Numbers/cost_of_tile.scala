try {
  println(args(0).toInt * args(1).toInt * args(2).toInt)
} catch {
  case e: ArrayIndexOutOfBoundsException => println("Enter the inputs in  the following order: Price Height Width")
}
