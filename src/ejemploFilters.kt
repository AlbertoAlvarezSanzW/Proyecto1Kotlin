

fun main(){

    /*
    Los filters permiten obtener los elementos de una lista que coinciden con
    ciertas condicoones

     */

    val colores = mutableListOf("Rojo","Azul","Verde","Naranja","Amarillo")

    val listaAMayuscula = colores.filter { it.contains("A") }
    println("listaAMayuscula : $listaAMayuscula")

    //otra manera de hacer
    val listaCuatroLetras = colores.filter { it.length == 4 }
    println("listaCuatroLetras : $listaCuatroLetras")

    var arrayListaMeses : List<String> = arrayListOf("Enero", "Febrero", "Marzo")

    //Para obtener el resultado del mes de enero como una lista
    var listaMeses: List<String> = arrayListaMeses.filter { s -> s == "Enero" }
    //lo obtenemos como un String
    var mes:String = arrayListaMeses.filter { s -> s == "Enero" }.single()
    var mes2:String = arrayListaMeses.single { s -> s == "Enero" }

    /*
    Para evitar realizar copias de la listas se utilizaran "lazys", que mantiene
    la lista original sin realizar copia
     */


}