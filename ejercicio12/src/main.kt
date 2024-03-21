fun main(){
    println(joinOptions(arrayOf("Fran", "Delfi", "Maru")))
    println(joinOptions(arrayOf("a", "b", "c")))
}

fun joinOptions(array: Array<String>): String{
    return array.joinToString(prefix = "[", postfix = "]")
}