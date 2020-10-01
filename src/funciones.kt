

fun main(args:Array<String>){

    printMessageWithPrefix("hola")
    printMessage("hola 2")

}

fun printMessageWithPrefix(message:String, prefix:String = "Info"){
    println("[$prefix] - $message")
}

fun printMessage(message: String){
    println("$message")
}