package introkotlin.samplekotlin.step3

import java.util.*

/**
 * On a ici gratuitement... un constructeur,
 * deux propriétés et leurs getters associés.
 */
class Money(
  val value: Double,
  val currency: String
) {

  /**
   * Je peux invoquer du Java de manière transparente.
   */
  override fun hashCode(): Int {
    return Objects.hash(value, currency)
  }

  override fun equals(other: Any?): Boolean {
    // Le when pour faire une sorte de switch
    // On a également le compilateur qui détecte automatiquement
    // le this de other pour la branche "other is Money"
    return when {
      this === other -> true
      other is Money -> value == other.value && currency == other.currency
      else -> false
    }
  }

  /**
   * Autre syntaxe pour implémenter une méthode, + template string.
   */
  override fun toString() = "Money(value=$value, currency='$currency')"

}
