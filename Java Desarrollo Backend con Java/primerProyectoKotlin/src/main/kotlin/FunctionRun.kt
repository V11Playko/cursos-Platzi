fun main(args: Array<String>){
    val moviles = mutableListOf("Samsung A50","Samsung A51","Samsung A52")
        .run{
            removeIf{ movil->movil.contains("A50") }
            this
        }
    println(moviles)
}