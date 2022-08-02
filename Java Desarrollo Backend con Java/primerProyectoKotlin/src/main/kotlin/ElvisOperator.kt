fun main(args: Array<String>) {
    println("Practicando operador Elvis")
    val m: String? = null
    val l: Int = if (m != null) m.length else -1
    println(l)

    //Con el operador Elvis expresamos
    // lo mismo que en la línea anterior
    val c = m?.length ?: -1
    println(c)
}