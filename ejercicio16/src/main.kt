
fun main(args: Array<String>) {
    val myNum = 245267785
    val result = myNum.removeFirstLastDigit()
    println("Resultado: $result")
}

fun Int.removeFirstLastDigit(): Int{
    var numfinal = 0
    if (this > 99) {
        val numstri = this.toString()
        numfinal = numstri.removeFirstLastChar().toInt()
    }
    return numfinal
}

fun String.removeFirstLastChar() = this.substring(1, this.length - 1)