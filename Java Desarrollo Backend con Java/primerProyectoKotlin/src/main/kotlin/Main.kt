
const val PI = 3.1416

fun main(args: Array<String>) {
    val pais = "Argentina"

    when(pais) {
        "Argentina" -> {
            println("El idioma de ${pais} es Español");
        }

        "Alemania" -> {
            println("El idioma de ${pais} es Aleman");
        }

        "EEUU" -> {
            println("El idioma de ${pais} es Ingles");
        }

        "Brasil" -> {
            println("El idioma de ${pais} es Portugues");
        }

        else -> {
            println("No conocemos el idioma");
        }
    }

    val edad = 33;

    when(edad) {
        in 0..3 -> {
            println("Tu edad es ${edad} eres un bebe");
        } in 4..11 -> {
        println("Tu edad es ${edad} eres un niño");
    } in 12..18 -> {
        println("Tu edad es ${edad} eres un adolecente");
    } in 19..59 -> {
        println("Tu edad es ${edad} eres un adulto");
    } in 60..99 -> {
        println("Tu edad es ${edad} eres un adulto mayor");
    } else -> {
        println("😲");
    }
    }
}