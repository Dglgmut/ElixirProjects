// TODO: use an immutable library
import java.util.Calendar
import java.text.SimpleDateFormat
def dateToMonth(date: Calendar): String = new SimpleDateFormat("MMMM").format(date.getTime)
