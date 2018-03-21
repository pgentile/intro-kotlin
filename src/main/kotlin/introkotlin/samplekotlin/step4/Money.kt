package introkotlin.samplekotlin.step4

/**
 * Pattern Value Object dans le langage.
 *
 * On obtient un objet avec un hashCode, un equals et un
 * toString automatique, grâce aux propriétés définies dessus.
 */
data class Money(
  val value: Double,
  val currency: String
)
