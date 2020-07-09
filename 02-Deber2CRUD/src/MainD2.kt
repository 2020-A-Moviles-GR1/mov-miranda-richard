/*Deber 02 - Fecha entrega: 09 de Julio de 2020
 Escribir un programa CRUD (Create Read Update Delete).
 Estas operaciones deben de realizarse en las dos entidades.
 Las entidades deben de tener 5 datos cada una Ej: Nombre.
 Entre los 10 datos de las entidades deben de haber las siguientes variables diferentes de Java
    EJ: Fecha, Booleano, String, Entero, Decimal. Las entidades estan relacionadas de UNO a MUCHOS.

 En el ejemplo 1 RECETA contiene un arreglo de INGREDIENTES.
 Ej:
Receta 1
5 datos

Nombre (str)
	Numero Total de ingredientes (int)
	etc
Ingrediente N
5 datos

Toda la información se va a guardar en ARCHIVOS*/


import java.util.*
import java.io.File

fun main(args: Array<String>) {

    //crear factura, ejemplo
    val factura1 = Factura(2, "limpieza", 12.00, 10.00, true )

    //crear item, ejemplo
    val item1 = Item("Chompa", "Ropa", 3, 4.50,12.0)
    println(factura1.recibiconformeFactura)
    println(item1.nombreItem)

    println("¿Sobre qué entidad desea trabajar? por favor escriba el número correspondiente: ")
    println("1 Factura, 2 Item")
    val entidadSeleccionada = readLine()?.toInt()
    when(entidadSeleccionada){
        1 -> {println("Ha seleccionado trabajar sobre la entidad Factura"); crudFactura()}
        2 -> {println("Ha seleccionado trabajar sobre la entidad Item"); crudItem()}
        else -> println("No ha seleccionado ninguna opción, Adiós")
    }

   }

fun crudFactura(){
    println("¿Qué función CRUD desea realizar sobre una Factura? por favor escriba el número correspondiente")
    println("1 permite crear, 2 permite leer, 3 permite actualizar, 4 permite borrar algún dato")
    val funcionCrud = readLine()?.toInt()
    when(funcionCrud){
        1 -> {println("Ha seleccionado crear Factura"); Factura().crearFactura()}
        2 -> {println("Ha seleccionado leer Factura"); Factura().leerFactura()}
        3 -> {println("Ha seleccionado actualizar Factura"); Factura().actualizarFactura()}
        4 -> {println("Ha seleccionado borrar Factura"); Factura().borrarFactura()}
        else -> println("No ha seleccionado ninguna opción")
    }
}

fun crudItem(){
    println("¿Qué función CRUD desea realizar sobre un Item? por favor escriba el número correspondiente")
    println("1 permite crear, 2 permite leer, 3 permite actualizar, 4 permite borrar algún dato")
    val funcionCrud = readLine()?.toInt()
    when(funcionCrud){
        1 -> {println("Ha seleccionado crear Item"); Item().crearItem()}
        2 -> {println("Ha seleccionado leer Item"); Item().leerItem()}
        3 -> {println("Ha seleccionado actualizar Item"); Item().actualizarItem()}
        4 -> {println("Ha seleccionado borrar Item"); Item().borrarItem()}
        else -> println("No ha seleccionado ninguna opción")
    }
}