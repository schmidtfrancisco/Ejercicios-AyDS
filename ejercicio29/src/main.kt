data class A(val b: String?, val c: Int?, val d: List<Boolean?>?)
fun testNullablesSimp() {

    val a1 = A("B1", null, null)
    val a2 = A(null, 2, null)
    val a3 = A(null, null, listOf(null, false, true, null))
    val a4 = A(null, null, null)

    val listA = listOf(a1, a2, a3, a4)

    listA.forEach {
        it.b?.let { println(it) } ?: it.c?.let { println(it) } ?: it.d?.let {
            it.forEach { it?.let { print(it) } }
            println()
        } ?: println("all null")
    }
}