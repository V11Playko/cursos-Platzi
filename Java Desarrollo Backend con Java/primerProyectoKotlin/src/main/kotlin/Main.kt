
const val PI = 3.1416

fun main(args: Array<String>) {
    var contador = 10
    while (contador > 0){
        println("El valor del contador es ${contador}")
        contador--
    }

    do {
        println("Generando numero aleatorio")
        val numeroAleaorio = (0..100).random()
        println("EL numero generado es ${numeroAleaorio}")
    }while (numeroAleaorio > 50) 

}