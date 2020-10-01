

class Cliente

class Contacto (val id: Int, var email:String)

fun main(args: Array<String>){

    val cliente = Cliente()
    val contacto = Contacto(1,"alberto.alvarez.sanz@gmail.com")

    println(contacto.id)
}

//1 -> declarar una clase llamada cliente sin atrubutos ni constructores
//Kotlin crea un constructor por defecto de manera automatica

//2 -> declaramos una clase llamada contacto con dos atrubutos. una constrante (id)
// una variable (email) y. a la vez, un constructor con dos parametros.

//3 -> creamos una instancia de la clase cliente a traves del constructor por
//defecto, ojo no hay new

//4 -> creamos una instancia de la clase constacto utilizando el contructor
//de dos parametros

//5 -> accedemos a la propiedad/atrubuto id

//6 -> nmodificamos el valor de la propiedad/atributo email