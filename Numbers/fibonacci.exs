defmodule Math do
  def fibonacci(0) do
    1
  end

  def fibonacci(1) do
    1
  end
  
  def fibonacci(number) do
    fibonacci(number-1) + fibonacci(number-2)
  end
end

IO.puts Math.fibonacci(4)
