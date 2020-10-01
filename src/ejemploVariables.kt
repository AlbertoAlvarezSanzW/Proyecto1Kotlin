//ejemplo variables:

fun main(args: Array<String>){

    //variables

    var variableInt: Int
    var variableLong: Long = 10


    //Constante
    val variable = 1

    //variable2 = variable -> esto nos daria un error de compilación en cuanto al tipado
    variableLong = variable.toLong()  // casting


    //comprobar el tipo de dato en este caso una variable
    if (variable is Int)
        println("es un tipo entero")
    else println("no es un tipo entero")

    // protección de las variable
    // contra los NULL
    var nuncaNull: String ="esta variable esta con cadena"

    var variableNula: String? ="sdf"   // hemos de indicar con un ? para que pueda ser nula
    variableNula = null


    fun strLegth(notNull:String):Int{
        return notNull.length
    }

    strLegth(nuncaNull)
    //strLength(nullable) error dfe compilación pasando un nulo a un parametro que no es null


    fun describeString(puedeSerString:String?):String{              //1
        if (puedeSerString != null && puedeSerString.length>0)      //2
            return "longitud del string: ${puedeSerString.length}"  //3
        else
            return "valor vacio o null"
    }
    // 1-> es una función que toma un string que puede ser null y retorna texto
    // 2-> Si el string no es null y no es vacio, retorna la longitud
    // 3-> en otro caso retorna el texto valor vacio o null.

    var resultado = describeString(nuncaNull)
    println(resultado)


    //Arrays
    val myArrayDeEnteros = arrayOf<Int>(10,20,30)
    val myArrayDeBooleanos = booleanArrayOf(true, true, false)
    val myArrayDeString = arrayOf("Pac0","Alberto","Sim0n")

    //array enteros
    println(myArrayDeEnteros[0])
    println("resultado de la impresión de la array de enteros, posición 0: ${myArrayDeEnteros[0].toString()}")

    //array boleanos
    println(myArrayDeBooleanos[0])
    println("resultado de la impresión de la array de enteros, posición 0: ${myArrayDeBooleanos[0].toString()}")

    //array String
    println(myArrayDeString[0])
    println("resultado de la impresión de la array de enteros, posición 0: ${myArrayDeString[0]}")


}