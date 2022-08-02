fun main(args: Array<String>) {
// For
    val listaDeFrutas = listOf("Manzana","Pera","Piña","Frambuesa")
    for (fruta in listaDeFrutas) println(fruta)
    println("For Each")
    //For Each
    listaDeFrutas.forEach{
        println("El nombre de la fruta es: $it ")
    }
    println("Map")
    //Map
    val nuevaLista = listaDeFrutas.map { it.length }
    println(nuevaLista)


    //Filter
    val listaFiltrada = nuevaLista.filter { it > 4 }
    println(listaFiltrada)
}