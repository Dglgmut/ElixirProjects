class Coins(coinType: Symbol) {
  def value: Double = coinTypesDictionary(coinType)
  def toOneDollar: Double = 1.0 / this.value
}
object Coins{
  private val coinTypesDictionary = Map[Symbol, Double]('penny -> 0.01, 'nickel ->  0.05, 'dime -> 0.10, 'quarter -> 0.25 )
  def coinTypes: Iterable[Symbol] = coinTypesDictionary.keys
}
println(Coins.coinTypes)
