fun main(){
    cookiePlay()
}
fun cookiePlay() {
    with(

        listOf("Panda", "Rabbit", "Bear", "Penguin", "Kangaroo")
            .shuffled()
            .reduce { s1: String, s2: String ->
                println("Who took the cookie from the cookie jar?")
                println("$s1 took the cookie from the cookie jar.")
                println("Who me?\nYes, you!\nNot me!\nThen who?")
                println("$s2!")
                println()
                s2
            }
    ) {
        println("Who took the cookie from the cookie jar?")
        println("$this took the cookie from the cookie jar.")
        println("Who me?\nYes, you!\nOkay, okay… I took the cookie.")
    }
}