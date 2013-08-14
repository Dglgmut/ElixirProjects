class Coins(coinType: Symbol) {
  def value: Double = Coins.coinTypesDictionary(coinType)
  def toChange(moneyGiven: Double, price: Double): Int = ((price - moneyGiven) / this.value).toInt
  def changeable(moneyGiven: Double, price: Double): Boolean = toChange(moneyGiven, price) > 0
}
object Coins{
  private val coinTypesDictionary = Map[Symbol, Double]('penny -> 0.01, 'nickel ->  0.05, 'dime -> 0.10, 'quarter -> 0.25 )
  def coinTypes: List[Symbol] = coinTypesDictionary.keys.toList
  def tryChanges(moneyGiven: Double, price: Double): Iterable[Any] =  coinTypes.reverse.map(e => e)
}
