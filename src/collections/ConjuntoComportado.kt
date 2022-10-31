package collections

fun main() {
    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    // aprovados.add(1)

    println("Sem ordem...")
    for(aprovado in aprovados) {
        aprovado.print()
    }

    val aprovadorNaOrdem1 = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("\nLinked...")
    for (aprovado in aprovadorNaOrdem1) {
        aprovado.print()
    }

    val aprovadorNaOrdem2 = sortedSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("\nLinked...")
    for (aprovado in aprovadorNaOrdem2) {
        aprovado.print()
    }

    // Ordem maluca...
    aprovados.sortedBy { it.substring(1)}.print()

}