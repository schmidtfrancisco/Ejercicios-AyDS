fun main(){
    println(esPrimo(5))
    println(esPrimo(10))
    println(esPrimo(17))
}

fun esPrimo(n: Int): Boolean {
    var div = 2
    var primo = true
    while (div < n && primo){
        if (n % div == 0)
            primo = false
        div++
    }
    return primo
}