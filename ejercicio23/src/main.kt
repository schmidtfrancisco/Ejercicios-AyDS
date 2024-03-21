fun main(){
    println(esPrimo(1))
    println(esPrimo(5))
    println(esPrimo(10))
    println(esPrimo(17))
}

fun esPrimo(n: Int): Boolean {
    val lis : MutableList<Int> = (2..<n).toMutableList()
    val multExt = lis.filter { n % it == 0 }
    return multExt.isEmpty()
}