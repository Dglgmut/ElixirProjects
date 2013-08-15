println("Type 'd' for a decimal number or 'b' for binary number")
if(readLine()(0) == 'd'){
  println("Enter a decimal to convert to binary")
  println(readLine().toInt.toBinaryString)
} else {
  println("Enter a binary to convert to decimal")
  println(Integer.parseInt(readLine(),2))
}
