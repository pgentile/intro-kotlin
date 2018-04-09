class NpeBuildFailure {

  fun case1() {
    val maybeString: String? = null

    // Ne compile pas
    val str: String = maybeString

    // Ne compile pas non plus
    println("Valeur: ${maybeString.toUpperCase()}")
  }

}
