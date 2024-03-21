class Piramide (val name: String) {

    infix fun createPyramid(rows: Int){
        var espacios = (rows * 2) - 2
        var asteriscos = 1                      //También puede ser segun el num de fila: rows * 2 - 1
        for (i in 1..rows){
            for (j in 1..espacios){
                print(" ")
            }
            for (k in 1..asteriscos) {
                print("* ")
            }
            println()
            asteriscos += 2
            espacios -= 2
        }
    }
}

fun main(){
    val pir = Piramide("egipcia")
    pir createPyramid 5
}.