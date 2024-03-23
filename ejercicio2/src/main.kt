fun main(){
    println(esPar(8))
    println(esPar(5))
}

fun esPar (x: Int) = (x % 2) == 0

//Con rem, funcion de extension
fun esPar (x: Int) = x.rem(2) == 0
