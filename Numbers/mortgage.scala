// TODO: use an immutable library
import java.util.Calendar
import java.text.SimpleDateFormat
import java.util.Date

var timeNow = Calendar.getInstance
def sumDateToOutput: String = {
  timeNow.add(Calendar.MONTH, mortgageTerm)
  new SimpleDateFormat("MMMM yyyy").format(timeNow.getTime)
}
def monthlyPayment: String = 
  (mortgageAmount * (interestRate / 100 + 1) / mortgageTerm).toString

println("Enter the mortgage amount")
val mortgageAmount: Integer = readLine().toInt
println("Enter the interest rate")
val interestRate: Float = readLine().toFloat
println("Enter the mortgage term(months)")
val mortgageTerm: Integer = readLine().toInt 

println("You will pay monthly " + monthlyPayment + " until " + sumDateToOutput )
