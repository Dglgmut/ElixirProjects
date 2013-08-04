def fibonacci(value: Int): Int = {
  if(value <= 1)
    return 1
  else
    fibonacci(value - 1) + fibonacci(value - 2)
}
println("Enter a number for fibonacci function:")
println(fibonacci(readLine().toInt))
