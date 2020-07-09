import java.util.*
import java.util.function.Consumer

fun main(args: Array<String>) {
 val arregloCumpleaños: ArrayList<Int> = arrayListOf(30, 31, 45)
    println(arregloCumpleaños)
    arregloCumpleaños.add(24)
    println(arregloCumpleaños)
    arregloCumpleaños.remove(31)
    println(arregloCumpleaños)

    arregloCumpleaños
            .forEach {
                println("El valor de cada ejecución es: " + it)
            }
    val respuestaMap = arregloCumpleaños
            .map { iter: Int ->
            iter * -1}
                println(respuestaMap)
                println(arregloCumpleaños)

}