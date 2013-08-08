val maxValue = 999999999
def readKeyAndPrintNextPrimeNumber(primeNumbers: Range):Range = {
  console.readVirtualKey()
  println(primeNumbers(0))
  readKeyAndPrintNextPrimeNumber(primeNumbers.tail)
}
println("This program will print prime numbers for each key stroke,'Ctrl + c to exit'")
val console = new tools.jline.console.ConsoleReader()
readKeyAndPrintNextPrimeNumber(2 to maxValue).filter( i => true)
