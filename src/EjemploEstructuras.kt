


fun main() {

    // Arrays
    val myArrayDeEnteros = arrayOf<Int>(10, 20, 30)
    val myArrayDeBooleanos = booleanArrayOf(true, false, false)
    val myArrayDeStrings = arrayOf("Alberto", "Laura", "Boss")


    //Listas
    /*
    Las listas son de los tipos mas utilizados en kotlin
    su forma de acceso es a traves de su indice.
     */
    val list = mutableListOf<Int>(1, 2, 3)


    // la lista que creamos con aslist mantiene la referencia al array original
    // las listas creadas con toList/toMutableLust crea una copia del array original
    val lista1 = myArrayDeBooleanos.asList()
    val lista2 = myArrayDeEnteros.asList()
    val lista3 = myArrayDeStrings.toList()


    println("Uso de asList")
    val arr1 = arrayOf(1, 2, 3)
    val l1 = arr1.asList()

    arr1[0] = 4
    println(l1)




    println()
    println("Uso de toList")
    val arr2 = arrayOf(1, 2, 3)
    val l2 = arr2.toList()
    arr2[0] = 4
    println(l2)


    // crear una lista aplicando funciones
    val _lista = MutableList(99) { pos -> if (pos % 2 == 0) pos *-1 else pos}
    val list1 = mutableListOf(1,2,"a",2.1)
    val array = arrayOf("Hola", "Adios")
    val list3 = mutableListOf(_lista,list1,array,"tres")

    /*
    Obtrener los elementos de una lista
    // elementAt(), first(), last()

    Si el tamaño de la lista es menor que el indice especifico se lanza una excepción
    Al contrario que en java se puede utilizar dos funciones que evitan estas excepciones

    getOrElse() -> permite obtener un valor por defecto si el indice no esta en la colleccion
    getOrNull() -> retorna null como valor por defecto.

    */

    println("obtener elementos de una lista")
    val numeros = listOf(1,2,3,4)
    println(numeros.get(0))
    println(numeros[0])

    println(numeros.getOrNull(5))       // retorna null
    println(numeros.getOrElse(5,{it}))  // retorna 5

    // obtener partes de una lista
    val numeros2 = (0..13).toList()
    println("obtener una sublista")
    println(numeros2.subList(3,6))


    /*
    Busqueda de elementos
    1º Busqueda Lineal
    usaremos indexOf() y lastIndexOf()
    */
    println("Busqueda de posiciones")
    val numeros3 = listOf(1,2,3,4,5)
    println(numeros3.indexOf(2))
    println(numeros3.lastIndexOf(2))


    // Tambien tenemos otras funciones que biscan elementos a partir de una excepción
    val numeros4 = mutableListOf(1,2,3,4)
    println(numeros4.indexOfFirst({it > 2}))  // 1

    println(numeros3.indexOfLast{it % 2 == 1})

    /*
     1 -> Retorna el indice del primer elemento que coincide con el predicado
     0 retorna -1 si no hay elementos

     2 -> Retorna el indice del ultimo elemento que coincide con el predicado
     0 retorna -1 si no hay elementos
    */

    /*


    ----------------------------------------------------------

    Busqueda binaria

    Es mas rapida pero requiere ordenación en orden ascendente
    binarySearch()

    Si el elemento existe, la función ewroen el indice
    sino, retorna (-insertionPoint-1) donde insertionPoint es el indice donde
    el elemento debe ser insertado si la lista lo imcluyera
    se puede especificar un rango de busqueda. En este caso la función solo busca
    entre los indices
     */


    println("Busqueda binaria en una lista")
    val numeros5 = mutableListOf("one","two", "three", "four")
    numeros5.sort()
    println(numeros5)
    println(numeros5.binarySearch("two"))
    println(numeros5.binarySearch("z"))
    println(numeros5.binarySearch("two",0,2))


    //Escribir elementos
    println("Añadir elementos a una lista")
    val numeros6 = mutableListOf("one","five", "six")
    numeros6.addAll(2, listOf("three", "four"))
    println(numeros6)

    //actualizar elementos de una lista
    //

    //borrado de elementos
    println("Borrado de elementos de una lista")
    val numeros8 = mutableListOf(1,2,3,4,5)
    numeros8.removeAt(2)
    println(numeros8)

    //removeFirst/removeLast
    val numeros9 = mutableListOf(1,2,3,4,5)
    numeros9.removeFirst()
    numeros9.removeLast()




    //Bucles avanzados para recorrer listas / arrays
    println("Bucles avanzados para recorrer listas/arrays")
    val numeros10 = mutableListOf(1,2,3,4,5)

    for (index in numeros10.indices){
        println(numeros10)
    }


    println("Bucles para obtener indices y elementos")
    val numeros11 = mutableListOf(1,20,300,4000,50000)

    //for ((index,element)){
        println(numeros10)
    //}
















}