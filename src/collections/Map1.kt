package collections

fun main() {
    var map = HashMap<Long, String>()

    map.put(10020030040, "João")
    map.put(30020030040, "Maria")
    map.put(60020030040, "Pedro")

    map.put(60020030040, "Pedro Filho")

    for (par in map) {
        println(par)
    }

    for (nome in map.values) {
        println(nome)
    }

    for (cpf in map.keys) {
        println(cpf)
    }

    for((cpf, nome) in map) {
        println("$nome (CPF: $cpf)")
    }

    map.size.print()
    map.get(60020030040)?.print()
    map[60020030040]?.print()
    map.containsKey(60020030040).print()
    map.remove(60020030040)?.print()
    map.clear()
    map.isEmpty().print()
}