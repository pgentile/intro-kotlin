package introkotlin.samplekotlin.step5

/**
 * On peut faire nos propres opérateurs.
 */
data class Money(
  val value: Double,
  val currency: String
) {

  operator fun plus(other: Money): Money {
    return if (currency == other.currency) {
      // copy : méthode introduite par le caractère "data" de la classe
      // On peut également nommer les arguments des méthodes, pour mieux
      // s'y retrouver par la suite
      copy(value = value + other.value)
    } else {
      throw IllegalArgumentException("Different currencies: $currency != ${other.currency}")
    }
  }

}

fun main(vararg args: String) {
  val money = Money(10.0, "EURO") + Money(5.0, "EURO")
  println("Money = $money")
}
