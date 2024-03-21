fun main(){
    createPyramid(8)
    createPyramide(8)
}

fun createPyramid(rows: Int){
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

//Sin espacios entre asteriscos (Chat GPT)
fun createPyramide(rows: Int): Unit{
    var spaces = rows - 1
    var i = 1
    while (i <= rows) {
        var j = 1
        while (j <= spaces) {
            print(" ")
            j += 1
        }
        var k = 1
        while (k <= 2 * i - 1) {
            print("*")
            k += 1
        }
        println()
        spaces -= 1
        i += 1
    }
}
