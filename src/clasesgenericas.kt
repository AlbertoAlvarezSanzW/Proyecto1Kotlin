


/*

Generics es un mecanismo general que se utiliza en lenguajes de programación
modernos.
    - puede haber clases genericas y funciones genericas.

Permite automentar la reutilización del codigo y el encapsulamento independizando
el tipo de datos.

 */

class PilaVariable<E> (vararg items: E){     //1

    //Atributos
    private val elements = items.toMutableList()        //2

    //Funciones
    fun push(element: E) = elements.add(element)        //3

    fun peek():E = elements.last()

    fun pop():E = elements.removeAt(elements.size-1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    fun toSring() = "PilaVariable(${elements.joinToString()})"

}

fun <E> pilaVariable(vararg element: E) = PilaVariable(*element)

fun main(){
    val pila = pilaVariable(0.62,3.15,2.7)
    println(pila)
}


/*
1 definimos una clase generica donde E es el tipo de dato generico.
2 definir como atributo los elementos de la pila
3 dentro de la clase generica, el tipo generico E puede ser utilizado
 */
