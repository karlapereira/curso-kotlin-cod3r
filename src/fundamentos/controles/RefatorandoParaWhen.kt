package fundamentos.controles

fun main() {
    val nota = 10

    when(nota){
        10, 9 -> println("Fantástico")
        8,7 -> print("Parabéns")
        6,5,4 -> print("Tem como recuperar")
        in 0..3 -> print("Te vejo no próximo semestre")
        else -> print("Nota inválida")
    }
}