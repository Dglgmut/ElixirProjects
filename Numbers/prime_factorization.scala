object PrimeNumbersManipulator {
  def primeNumbersUntil(number: Int): List[Int] = (2 to number).filter( i => (2 to number).forall{o => (i == o || i % o > 0)} ).toList
  def factorsFor(number: Int): List[Int] = {
    val elements: List[Int] = primeNumbersUntil(number)
    elements.filter( i => number % i == 0)
  }
}
println(PrimeNumbersManipulator.factorsFor(10))
