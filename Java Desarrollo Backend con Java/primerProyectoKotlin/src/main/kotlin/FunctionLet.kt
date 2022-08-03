fun main(args: Array<String>){

    //Let ejecuta código cuando el valor no es nulo
    var nombre: String? = null
    nombre?.let{
        //Código no se ejecutara al ser la variable nula
            valor -> println("El nombre no es nulo es $valor")
    }

    nombre = "David"
    nombre?.let{
        //Código  se ejecutara
            valor -> println("El nombre no es nulo, es $valor")
    }
}