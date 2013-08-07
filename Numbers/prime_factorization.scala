var factors: List[Int] = Nil
def divide(divisibleNumbers: IndexedSeq[Int], number: Int): List[Int] = {
  if(divisibleNumbers.length > 0){
    if(number % divisibleNumbers(0) == 0){
      divide(divisibleNumbers, (number / divisibleNumbers(0)))
      factors = factors :+ divisibleNumbers(0) 
      factors
    }
    else 
      divide(divisibleNumbers.tail,number)
  }
  else
    Nil
}
def factorsFor(number: Int): Unit = {
  val allNumbersList: Range = (2 to number)
  val divisibleNumbers = allNumbersList.filter(  i => number % i == 0)
  println(divide(divisibleNumbers,number))
}
println("Enter a number to see its prime factors")
factorsFor(readLine().toInt)
