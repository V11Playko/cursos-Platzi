fun main(args:Array<String>){
    //Es similar a una lista, pero sin elementos repetidos
    //Conjunto inmutable
    val numsRep = setOf(1,2,3,4,1)
    println(numsRep)

    //Conjunto mutable y sus operaciones
    val numsRepMutable = mutableSetOf(1,2,3,4)
    numsRepMutable.add(4)
    println(numsRepMutable)
    numsRepMutable.add(5)
    println(numsRepMutable)
    numsRepMutable.remove(1)
    println(numsRepMutable)

    //Primer valor mayor a 2
    val valorSet = numsRep.first{ num -> num > 2}
    println(valorSet)

    //Podemos hacerlo nullable
    val valorSet2 :Int? = numsRep.firstOrNull{ num -> num > 10}
    println(valorSet2)

}