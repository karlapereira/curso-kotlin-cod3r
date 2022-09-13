package fundamentos

fun main() {
    val valor: Any = "abc"

    if (valor is String){
        println(valor)
    } else if (valor !is String){
        println("Não é uma String")
    }
}