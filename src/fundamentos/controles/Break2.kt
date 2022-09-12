package fundamentos.controles

fun main() {
    loopexterno@for (i in 1..15){
        for (j in 1..15){
            if (i == 2 && j == 9) break@loopexterno
            println("$i $j")
        }
    }
    println("Fim!")
}