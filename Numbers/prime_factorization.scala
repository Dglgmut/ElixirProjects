def factorsFor(number: Int): IndexedSeq[Int] = {
  val allNumbersList: Range = (2 to number)
  allNumbersList.filter(  i => number % i == 0).filter(i => allNumbersList.forall{o => (i == o || i % o > 0)})
}
println("Enter a number to see its prime factors")
println(factorsFor(readLine().toInt))
