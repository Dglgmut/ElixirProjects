class Coins(coinType: Symbol) {
  def value: BigDecimal = Coins.coinTypesDictionary(coinType)
  def toChange(price: BigDecimal, moneyGiven: BigDecimal): Int = ((price - moneyGiven) / this.value).toInt
  def changeable(price: BigDecimal, moneyGiven: BigDecimal): Boolean = toChange(moneyGiven, price) > 0
}
object Coins{
  private val coinTypesDictionary = Map[Symbol, BigDecimal]('penny -> 0.01, 'nickel ->  0.05, 'dime -> 0.10, 'quarter -> 0.25 )
  def coinTypes: List[Symbol] = coinTypesDictionary.keys.toList
  def getChanges(price: BigDecimal, moneyGiven: BigDecimal): List[Symbol] = {
    val avaiableCoins = coinTypes.filter{e => (new Coins(e)).changeable(price, moneyGiven)}
    if (avaiableCoins.length > 0 )
      avaiableCoins.last :: Coins.getChanges(price, moneyGiven - coinTypesDictionary(avaiableCoins.last))
    else
      Nil
  }
}
def countCoinType(coinType: Symbol, coinList: List[Symbol]): Int = coinList.filter(_ == coinType).length
def groupCoinTypes(coinList: List[Symbol]) = coinList.distinct.map(o => (o.name -> countCoinType(o, coinList)))
println("Insert the price")
print("$")
val price: BigDecimal = BigDecimal(readLine())
println("Insert how much money was given")
print("$")
val moneyGiven: BigDecimal = BigDecimal(readLine())
println(groupCoinTypes(Coins.getChanges(price, moneyGiven)))
