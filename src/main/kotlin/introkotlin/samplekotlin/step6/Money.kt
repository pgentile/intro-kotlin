/**
 * Démonstration des extension methods.
 */
package introkotlin.samplekotlin.step6

import java.util.concurrent.ThreadLocalRandom

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

/**
 * On peut enrichir des objets avec des extension methods.
 * C'est un moyen simple d'enrichir un objet avec des
 * méthodes utilitaires.
 */
fun Money.toBitcoin(): Money {
  val exchangeRate = ThreadLocalRandom.current().nextDouble(0.0, 0.001)
  return Money(value = value * exchangeRate, currency = "BITCOIN")
}

fun main(vararg args: String) {
  repeat(10) {
    val money = Money(10.0, "EURO")
    System.out.println("Money = ${money.toBitcoin()}")
  }
}
