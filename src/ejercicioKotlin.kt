import java.util.*

    // Escribe un programa que permita jugar a adivinar un numero.
    //
    // El resultado por pantalla deber ser el siguiente
    // Encuentra un numero entre 0..9
    // Escribe tu numero
    // 1 <- Valor introducido por el usuario
    // El numero buscado es mas grande
    // Escribe tu numero
    // 9 <- Valor introducido por el usuario
    // El numero buscado es mas peque
    // Escribe tu numero
    // 5 <- Valor introducido por el usuario
    // El numero buscado es mas peque
    // Escribe tu numero
    // 3 <- Valor introducido por el usuario
    // Enhorabuena! El numero era 3




import kotlin.random.Random

fun main (args: Array<String>){
    var resul:Int = Random.nextInt(0, 9)
    print("Encuentra un número entre 0..9\n")
    var numero:Int? =0
    do{
        do{
            print("Escribe tu número: ")
            numero= readLine()?.toInt()
        }while(numero!!>9 || numero<0)
        if(numero==resul)
            print("El numero es el mismo que ha generado el random")
        else if(numero>resul)
            print("El número buscado es más pequeño\n")
        else
            print("El número buscado es más grande\n")
    }while(numero!=resul)
}
