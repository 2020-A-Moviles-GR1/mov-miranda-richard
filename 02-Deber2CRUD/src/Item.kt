//ItemA.txt
import java.util.*
import java.io.File
import kotlin.collections.ArrayList

public class Item() {
    var nombreItem = ""
    var descripcionItem = ""
    var cantidadItem = 0
    var precioItem = 0.0
    var descuentoItem = 0.0

    constructor(nombreItem: String, descripcionItem: String, cantidadItem: Int,
                precioItem: Double, descuentoItem: Double):this() {

        this.nombreItem = nombreItem
        this.descripcionItem= descripcionItem
        this.cantidadItem = cantidadItem
        this.precioItem = precioItem
        this.descuentoItem = descuentoItem
    }

    fun crearItem(){
        println("Ingrese nombre del Item: ")
        this.nombreItem = readLine()?.toString()!!
        //File("ItemA.txt").writeText(this.nombreItem)

        println("Ingrese la descripción del Item: ")
        this.descripcionItem = readLine()?.toString()!!
        //File("ItemA.txt").writeText(this.descripcionItem)

        println("Ingrese la cantidad del Item: ")
        this.cantidadItem = readLine()?.toInt()!!
        //File("ItemA.txt").writeText(this.cantidadItem.toString())

        println("Ingrese precio del Item en decimales, ejm: 3.5 ")
        this.precioItem = readLine()?.toDouble()!!
        //File("ItemA.txt").writeText(this.precioItem.toString())

        println("Ingrese descuento del Item en decimales, ejm: 3.5 ")
        this.descuentoItem = readLine()?.toDouble()!!

        var nuevoArchivoItem = ("Item" + this.nombreItem + ".txt")
        File(nuevoArchivoItem).writeText("Item: " + this.nombreItem.toString() +
                "\nDescripción: "+ this.descripcionItem +
                "\nCantidad: " + this.cantidadItem.toString() +
                "\nPrecio: " +this.precioItem.toString() +
                "\nDescuento: " +this.descuentoItem.toString())

        println(nuevoArchivoItem)
        println("Item Creado!")
    }

    fun leerItem(){
        println("Ingrese el nombre del archivo de Item a leer: ")
        val itemALeer =  readLine()?.toString()!!
        println("Contenido: ")
        File(itemALeer).forEachLine { println(it) }
    }

    fun actualizarItem(){
        println("Ingrese el nombre del archivo de Item a ser modificado: ")
        var archivoItemAnterior =  readLine()?.toString()!!
        var aModificarItem: File = File(archivoItemAnterior)

        println("Ingrese el nuevo nombre del archivo de Item: ")
        var archivoItemNuevo =  readLine()?.toString()!!
        var mModificarItem: File = File(archivoItemNuevo)

        aModificarItem.renameTo(mModificarItem)
        println("Item Actualizado")
    }

    fun borrarItem(){
        println("Ingrese el nombre del archivo de Item a ser borrado: ")
        val itemABorrar =  readLine()?.toString()!!
        File(itemABorrar).delete()
        println("Item Borrado!")
    }
}
