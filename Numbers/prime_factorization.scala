def divide(divisibleNumbers: IndexedSeq[Long], number: Long): List[Long] = {
  if(number % divisibleNumbers(0) == 0){
    if(number == divisibleNumbers(0)) // This means it has reached the end of the divisibles
      List[Long](number)
    else
      List[Long](divisibleNumbers(0)) ::: divide(divisibleNumbers, (number / divisibleNumbers(0)))
  }
  else 
    divide(divisibleNumbers.tail,number)
}
def factorsFor(number: Long): List[Long] = {
  val numbersList = (2L to number)
  divide(numbersList,number)
}
println("Enter a number to see its prime factors")
println(factorsFor(readLine().toInt.toLong))
