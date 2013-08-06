object PrimeNumbersManipulator {
  def factorsFor(number: Int): List[Any] = {
    val elements: IndexedSeq[Int] = (2 to number).filter( i => (2 to  number).forall{o => i == o} )
    elements.toList.init
  }
}
println(PrimeNumbersManipulator.factorsFor(16))
