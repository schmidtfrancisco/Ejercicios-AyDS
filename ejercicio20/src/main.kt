fun main() {
    val lis: MutableList<String> = mutableListOf("Francisco", "Delfina", "Maria", "Fabio", "Elefante")
    ordAlf(lis)
    println(lis.toString())
    ordlong(lis)
    println(lis.toString())
    ordE(lis)
    println(lis.toString())
    marco(lis)
}

fun ordAlf(l: MutableList<String>){
    l.sortBy { it }
}

fun ordlong(l: MutableList<String>){
    l.sortBy { it.length }
}

fun ordE(l: MutableList<String>){
    l.sortByDescending { it.count { char -> char == 'e' } }
}

fun marco(l: MutableList<String>){
    val masancho = l.maxBy { it.length }
    val ancho = masancho.length

    println("*".repeat(ancho+4))
    for (el in l){
        val espacios = ancho - el.length
        println("* $el${" ".repeat(espacios)} *")
    }

    println("*".repeat(ancho+4))
}
