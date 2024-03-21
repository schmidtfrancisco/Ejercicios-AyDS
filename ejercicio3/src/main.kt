fun main(){
    println(esBisiesto(2024))
    println(esBisiesto(2023))
    println(esBisiesto(2020))
}

fun esBisiesto(a: Int) =
    (a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))