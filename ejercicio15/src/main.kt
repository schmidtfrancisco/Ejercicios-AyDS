fun main(){
    val myString = "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("Resultado: $result")
}

fun String.removeFirstLastChar() =
    if (this.length <= 2)
        this
    else
        this.substring(1, this.length - 1)