try {
  println()
} catch {
  case e: ArrayIndexOutOfBoundsException => println("Enter the inputs in  the following order: Price Height Width")
}
