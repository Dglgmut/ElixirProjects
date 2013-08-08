val maxValue = 999999999
def readKeyAndPrintNextPrimeNumber(primeNumbers: IndexedSeq[Int]): IndexedSeq[Int] = {
  console.readVirtualKey()
  println(primeNumbers(0))
  readKeyAndPrintNextPrimeNumber(primeNumbers.tail)
}
println("This program will print prime numbers for each key stroke,'Ctrl + c to exit'")
val console = new tools.jline.console.ConsoleReader()
readKeyAndPrintNextPrimeNumber((2 to maxValue).filter(i =>
  (2 to maxValue).forall{n =>
    (n == i || i % n > 0)}))
