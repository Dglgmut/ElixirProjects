lazy val factors = Nil
def divide(i: IndexedSeq[Int],o: Int): Int = {
  if(i.length > 0){
    if(o % i(0) == 0){
      println(i(0)) 
      factors :+ divide(i, (o / i(0)))
      i(0)
    }
    else 
      divide(i.tail,o)
  }
  else
    0
}
def factorsFor(number: Int): Unit = {
  val allNumbersList: Range = (2 to number)
  val divisibleNumbers = allNumbersList.filter(  i => number % i == 0)
  println(divide(divisibleNumbers,number))
}
println("Enter a number to see its prime factors")
factorsFor(readLine().toInt)
