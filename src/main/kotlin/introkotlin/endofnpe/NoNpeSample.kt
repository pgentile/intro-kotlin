package introkotlin.endofnpe

class NoNpeSample {

  fun case1() {
    // Cette valeur peut accepter null
    val maybeString: String? = null

    // Il faut faire un choix
    val str: String = maybeString ?: throw IllegalStateException("Je ne peux pas être null")

    // Le compilateur sait qu'ici, maybeString ne peut pas valoir null
    println("Valeur maybeString: ${maybeString.toUpperCase()}")

    println("Valeur str: ${str.toUpperCase()}")
  }

  fun case2() {
    val maybeString: String? = null
    val str: String = maybeString ?: "Valeur par défaut"

    println("Valeur str: ${str.toUpperCase()}")
  }

  fun case3() {
    val maybeString: String? = null
    val str: String = maybeString?.toUpperCase()?.reversed()?.trim().orEmpty()

    println("Valeur str: $str")
  }

}
