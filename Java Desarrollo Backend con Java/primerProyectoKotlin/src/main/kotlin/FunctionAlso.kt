fun main (args:Array<String>) {
    val moviles = mutableListOf("Samsung A50","Samsung A51","Samsung A52")
        .also { lista -> println("El valor original de la lista es $lista")
        }.asReversed()
    println(moviles)
}