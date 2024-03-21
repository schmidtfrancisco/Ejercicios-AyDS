fun main(){
    val str = "Hola mundo"
    val cod = str.cesarcod(2)
    println(cod)
    println(cod.cesardecod(2))
}

fun String.cesarcod(despl: Int): String{
    val textminus = this.lowercase()
    var carcifr: Int
    val cifrado = StringBuilder()
    for (carac in textminus){
        if (carac.isLetter()){
            carcifr = (carac.code - 'a'.code + despl) % 26
            carcifr += 'a'.code
            cifrado.append(carcifr.toChar())
        }
        else{
            cifrado.append(carac)
        }
    }
    return cifrado.toString()
}

fun String.cesardecod(despl: Int): String{
    var cardes: Int
    val plano = StringBuilder()
    for (carac in this){
        if (carac.isLetter()){
            cardes = (carac.code - 'a'.code - despl + 26 ) % 26
            cardes += 'a'.code
            plano.append(cardes.toChar())
        }
        else{
            plano.append(carac)
        }
    }
    return plano.toString()
}
