open class Directory (name: String): FileSystemElement(name) {
    private val elementos: MutableList<FileSystemElement> = mutableListOf()

    open fun add(obj: FileSystemElement){
        elementos.add(obj)
    }

    fun getElementos() = elementos

    override fun ls(level: Int) {
        println("${"- ".repeat(level)}$name/")
        for (e in elementos){
            e.ls(level + 1)
        }
    }
}