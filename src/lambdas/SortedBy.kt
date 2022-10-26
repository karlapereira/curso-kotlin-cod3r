package lambdas

fun main() {
    val nomes = arrayListOf("Renata", "Bernardo", "Willian", "Andreia", "Caio")
    val ordernados = nomes.sortedBy { it.reversed() }

    println(ordernados)
}