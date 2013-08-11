// TODO: use an immutable library
import java.util.Calendar
import java.text.SimpleDateFormat

def dateToOutput(date: Calendar): String = new SimpleDateFormat("MMMM yyyy").format(date.getTime)

println("Enter the mortgage amount")
val mortgageAmount: Integer = readLine().toInt
println("Enter the interest rate")
val interestRate: Float = readLine().toFloat
println("Enter the mortgage term(months)")
val mortgageTerm: Integer = readLine().toInt 
