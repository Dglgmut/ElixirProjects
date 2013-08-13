class Coins(coinType: Symbol) {
  private val coinTypes = Map[Symbol, Double]('penny -> 0.01, 'nickel ->  0.05, 'dime -> 0.10, 'quarter -> 0.25 )
  def value: Double = coinTypes(coinType)
  def toOneDollar: Int = (1.0 / this.value).toInt
}
