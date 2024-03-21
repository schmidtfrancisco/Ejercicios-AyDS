fun main(){
    println(dividir(5,2))
    println(dividir(5,0))
}

fun dividir(n: Int, m:Int): Float {
    var div: Int
    try {
        div = n/m
        return (n.toFloat())/(m.toFloat())
    }
    catch (e: ArithmeticException) {
        return Float.NaN
    }
}