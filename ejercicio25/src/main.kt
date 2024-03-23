fun main(){
    booksTest()
}

data class Book(val name: String, val authors: List<String>)

fun booksTest() {
    val books = listOf(
        Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))

    println(books.flatMap { it.authors }.toSet())

    println(books.filter { it.authors.contains("Terry Pratchett") }.map { it.name })
}

