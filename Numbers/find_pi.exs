defmodule Math do
  def pi_string do
    :erlang.float_to_binary(:math.pi)
  end

  def generate_pi_until(n) do
    String.slice(pi_string, 0, n)
  end
end

