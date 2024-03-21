fun main(){
    tablaMultiplicacion(2)
    println()
    tablaMultiplicacion(5)
}

fun tablaMultiplicacion(n: Int){
    for (num in 1..12){
        println("x $num | ${n * num}")
    }
}