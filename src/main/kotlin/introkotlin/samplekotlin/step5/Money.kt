package introkotlin.samplekotlin.step5

/**
 * On peut faire nos propres opérateurs.
 */
data class Money(
  val value: Double,
  val currency: String
) {

  operator fun plus(other: Money): Money {
    if (currency != other.currency) {
      throw IllegalArgumentException("Different currencies: $currency != ${other.currency}")
    }
    // copy : méthode introduite par le caractère "data" de la classe
    // On peut également nommer les arguments des méthodes, pour mieux
    // s'y retrouver par la suite
    return copy(value = value + other.value)
  }

}

fun main(vararg args: String) {
  val money = Money(10.0, "EURO") + Money(5.0, "EURO")
  System.out.println("Money = $money")
}
