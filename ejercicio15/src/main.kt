fun main(){
    val myString = "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("Resultado: $result")
}

fun String.removeFirstLastChar() = this.substring(1, this.length - 1)