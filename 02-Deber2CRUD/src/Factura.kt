//FacturaA.txt
import java.io.File
import java.util.*

public class Factura()
    {
        var numeroFactura = 1
        var conceptoFactura = ""
        var impuestoFactura = 0.0
        var totalFactura = 0.0
        var recibiconformeFactura = true

        constructor(numeroFactura: Int, conceptoFactura: String,
                    impuestoFactura: Double, totalFactura: Double, recibiconformeFactura: Boolean):this() {

            this.numeroFactura = numeroFactura
            this.conceptoFactura = conceptoFactura
            this.impuestoFactura = impuestoFactura
            this.totalFactura = totalFactura
            this.recibiconformeFactura = recibiconformeFactura
        }

        fun crearFactura(){
            println("Ingrese número de Factura: ")
            this.numeroFactura = readLine()?.toInt()!!
            //File("FacturaA.txt").writeText(this.numeroFactura.toString())

            println("Ingrese el concepto de Factura: ")
            this.conceptoFactura = readLine()?.toString()!!
            //File("FacturaA.txt").writeText(this.conceptoFactura)

            println("Ingrese el impuesto de Factura en decimales, ejm: 3.5 ")
            this.impuestoFactura = readLine()?.toDouble()!!
            //File("FacturaA.txt").writeText(this.impuestoFactura.toString())

            println("Ingrese el total de Factura en decimales, ejm: 3.5 ")
            this.totalFactura = readLine()?.toDouble()!!
            //File("FacturaA.txt").writeText(this.totalFactura.toString())

            println("Ingrese true si está conforme con la factura, false en el caso contrario ")
            this.recibiconformeFactura = readLine()?.toBoolean()!!

            var nuevoArchivoFactura = ("Factura" + this.numeroFactura + ".txt")
            File(nuevoArchivoFactura).writeText("Factura No. " + this.numeroFactura.toString() +
                                                    "\nConcepto: "+ this.conceptoFactura +
                                                    "\nValor del impuesto: " + this.impuestoFactura.toString() +
                                                    "\nTotal de la factura: " +this.totalFactura.toString() +
                                                    "\nConformidad con la factura: " +this.recibiconformeFactura.toString())

            println("Factura Creada!")
        }

        fun leerFactura(){
            println("Ingrese el nombre de la Factura a leer: ")
            val facturaALeer =  readLine()?.toString()!!
            println("Contenido:")
            File(facturaALeer).forEachLine { println(it) }
        }

        fun actualizarFactura(){
            println("Ingrese el nombre del archivo de Factura a ser modificado: ")
            var archivoFacturaAnterior =  readLine()?.toString()!!
            var aModificarFactura: File = File(archivoFacturaAnterior)

            println("Ingrese el nuevo nombre del archivo de Factura: ")
            var archivoFacturaNuevo =  readLine()?.toString()!!
            var mModificarFactura: File = File(archivoFacturaNuevo)

            aModificarFactura.renameTo(mModificarFactura)
            println("Factura Actualizada!")
        }

        fun borrarFactura(){
            println("Ingrese el nombre del archivo de Factura a ser borrado: ")
            val facturaABorrar =  readLine()?.toString()!!
            File(facturaABorrar).delete()
            println("Factura Borrada!")
        }
    }