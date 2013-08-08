def readKeyAndPrintNextPrimeNumber():Unit = {
  println(console.readVirtualKey())
  readKeyAndPrintNextPrimeNumber
}
println("This program will print prime numbers for each key stroke,'Ctrl + c to exit'")
val console = new tools.jline.console.ConsoleReader()
readKeyAndPrintNextPrimeNumber
