println("Type 'd' for a decimal number or 'b' for binary number")
if(readLine()(0) == 'd'){
  println("Enter a decimal to convert to binary")
  println(readLine().toInt.toBinaryString)
}
