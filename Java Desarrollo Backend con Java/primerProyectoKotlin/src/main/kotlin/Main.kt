
const val PI = 3.1416

fun main(args: Array<String>) {
    val nombre = "Gera"  //Declaramos una variable y le asignamos un valor
    //Aqui empieza nuestra estructura de control IF
    //Tenemos una prueba logica (donde preguntamos si nombre no esta vacia)
    //Si esto es verdad [IF] entonces vamos a imprimer la cantidad de caracteres que hay en la variable nombre
    //Si esto no es verdad [else] vamos a imprimir un mensaje de error diciendo que la variable esta vacia
    if (nombre.isNotEmpty()) {
        println("El largo de nuestra variable nombre es ${nombre.length}")
    } else {
        println("Error, la variable se encuentra vacia")
    }

    // Asignación de if
    var mensaje : String
    if (nombre.length > 8){
        mensaje = "Tienes un nombre largo!"
    } else {
        mensaje = "Tienes un nombre corto"
    }
    println(mensaje)

    // Asignación de if inmutable
    val mensajeInmutable = if (nombre.length > 8) "Tienes un nombre largo!" else "Tienes un nombre corto"
    println(mensajeInmutable)

    // Asignación de variable inmutable con else if
    val mensajeInmutable2= if (nombre.length > 8) "Tienes un nombre largo!" else if(nombre.isEmpty()) "Este nombre esta vacio :(" else "Tienes un nombre corto"
    println(mensajeInmutable2)


}