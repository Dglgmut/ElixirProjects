// TODO: use an immutable library
import java.util.Calendar
import java.text.SimpleDateFormat
def dateToOutput(date: Calendar): String = new SimpleDateFormat("MMMM yyyy").format(date.getTime)

