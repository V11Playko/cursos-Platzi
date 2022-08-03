fun main(args: Array<String>){
    //apply devuelve el valor de forma automatica
    //se puede crear una funcion apply segura
    val moviles = mutableListOf("Samsung A50","Samsung A51","Samsung A52")
        .apply {
            removeIf{movil -> movil.contains("A50")}
        }
    println(moviles)

    var colores : MutableList<String>? = null
    colores?.apply {
        //no lo corre porque es nulo
        println("Colores $this")
        println("Cantidad $size")
    }

    val colores2 : MutableList<String> = mutableListOf("Amarillo","Azul","Rojo")
    colores2?.apply {
        //no lo corre porque es nulo
        println("Colores $this")
        println("Cantidad $size")
    }
}