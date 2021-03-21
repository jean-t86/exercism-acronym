object Acronym {
    fun generate(phrase: String): String {
        val words = phrase.split(" ")
        return if (words.isNotEmpty()) {
            words.fold("", { acc, str ->
                acc + str.first()
            })
        } else {
            ""
        }.toUpperCase()
    }
}
