fun main(){
    val d1 = Directory("A")
    val d2 = Directory("B")
    val d3 = Directory("K")
    val d4 = Directory("L")
    val d5 = Directory("P")
    val d6 = Directory("Q")
    val d7 = Directory("R")

    val f1 = File("f1.dat")
    val f2 = File("f2.dat")
    val f3 = File("f3.dat")
    val f4 = File("f4.dat")
    val f5 = File("f5.dat")
    val f6 = File("f6.dat")

    RootDirectory.add(d1)
    RootDirectory.add(d2)

    d1.add(d3)
    d1.add(d4)

    d2.add(d5)
    d2.add(d6)

    d3.add(f1)
    d3.add(d7)

    d4.add(f4)

    d5.add(f5)
    d5.add(f6)

    d7.add(f2)
    d7.add(f3)

    RootDirectory.ls()

    listarArchivos()
}

fun listarArchivos(){
    listarArchivosRec(RootDirectory)
}

fun listarArchivosRec(d: Directory){
    for (e in d.getElementos()){
        if (e is File){
            println(e.name)
        }
        else if(e is Directory){
            listarArchivosRec(e)
        }
    }
}

