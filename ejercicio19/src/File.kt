class File(name: String): FileSystemElement(name) {

    override fun ls(level: Int) {
        println("${"- ".repeat(level)}$name")
    }
}