fun main(){
    val cod = cesarcod("Hola mundo", 2)
    println(cod)
    println(cesardecod(cod, 2))
}

fun cesarcod(texto: String, despl: Int): String{
    var textminus = texto.lowercase()
    var carcifr: Int
    var cifrado = StringBuilder()
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

fun cesardecod(cifrado: String, despl: Int): String{
    var cardes: Int
    var plano = StringBuilder()
    for (carac in cifrado){
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