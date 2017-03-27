import java.util.{Date, Locale}
import java.text.DateFormat._

/**
  * Created by relihazard on 18/02/17.
  */
object FrenchDate {
  def main(args: Array[String]): Unit = {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}
