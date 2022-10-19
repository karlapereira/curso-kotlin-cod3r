package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegada: Int)

fun main() {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Televisao("Brastemp", 320)

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)

    println(tv1 == tv2)
    println(tv1 === tv2)
    println(tv1.toString())
    println(tv1.copy(polegada = 42))

    // Destructuring em data class
    val (marca, pol) = tv1
    println("$marca $pol'")
}