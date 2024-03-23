
fun main(args: Array<String>) {
    val myNum = 245267785
    val result = myNum.removeFirstLastDigit()
    println("Resultado: $result")
}

fun Int.removeFirstLastDigit() =
    if (this > 99)
        this.toString().removeFirstLastChar().toInt()
    else
        this

fun String.removeFirstLastChar() = this.substring(1, this.length - 1)