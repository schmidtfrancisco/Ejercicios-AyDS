fun main(){
    println( foo("Francisco", toUpperCase = true))
}

fun foo(
    name: String,
    number: Int = 42,
    toUpperCase: Boolean = false
): String {
    return (if (toUpperCase) name.uppercase() else name) + number
}