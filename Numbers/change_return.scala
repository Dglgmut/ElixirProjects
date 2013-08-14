class Coins(coinType: Symbol) {
  def value: Double = Coins.coinTypesDictionary(coinType)
  def toChange(price: Double, moneyGiven: Double): Int = ((price - moneyGiven) / this.value).toInt
  def changeable(price: Double, moneyGiven: Double): Boolean = toChange(moneyGiven, price) > 0
}
object Coins{
  private val coinTypesDictionary = Map[Symbol, Double]('penny -> 0.01, 'nickel ->  0.05, 'dime -> 0.10, 'quarter -> 0.25 )
  def coinTypes: List[Symbol] = coinTypesDictionary.keys.toList
  def getChanges(price: Double, moneyGiven: Double): List[Any] = {
    val avaiableCoins = coinTypes.reverse.filter{e => (new Coins(e)).changeable(price, moneyGiven)}
    if (avaiableCoins.length > 0 )
      avaiableCoins.head :: Coins.getChanges(price, moneyGiven - coinTypesDictionary(avaiableCoins.head))
    else
      Nil
  }
}
