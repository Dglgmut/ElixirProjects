defmodule Math do
  def pi_string do
    :erlang.float_to_binary(:math.pi)
  end
end

