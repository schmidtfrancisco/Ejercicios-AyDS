fun main(){
    var cod = cesarcod("Hola mundo", 2)
    println(cod)
    println(cesardecod(cod, 2))
    cod = encode("Hi world", 2)
    println(cod)
    println(decode(cod,2))
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

fun encode(s: String, key: Int): String {

    var encoded = ""

    val sUpper = s.toUpperCase()

    for (i in 0..<s.length)
        encoded +=
            when {
                sUpper[i] !in 'A'..'Z' -> sUpper[i]
                else -> {
                    val c: Char = sUpper[i] + key
                    if (c > 'Z')
                        'A' + (c - 'Z') - 1
                    else
                        c
                }
            }
    return encoded

}

fun decode(s: String, key: Int): String {

    var decoded = ""

    val sUpper = s.toUpperCase()

    for (i in 0..<s.length) {
        decoded +=
            when {
                sUpper[i] !in 'A'..'Z' -> sUpper[i]
                else -> {
                    val c: Char = sUpper[i] - key
                    if (c < 'A')
                        'Z' - ('A' - c) + 1
                    else
                        c
                }
            }
    }
    return decoded
}