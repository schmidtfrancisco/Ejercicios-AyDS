fun main(){
    println(sumatoria(4))
}

fun sumatoria(n: Int): Int {
    var suma = 0;
    for (num in 1..n) {
        suma += num
    }
    return suma
}