package com.example.examencrudfactura2

import kotlinx.android.synthetic.main.activity_resultado_crud_factura.*

class servicioBaseDeDatos {
    companion object{
        var factura = arrayOf("10", "Varios", "12.0", "50.0", "Si")
        var item = arrayOf("Camiseta", "Ropa", "10", "5.5", "25.0")

        var numeroFactura = factura.get(0)
        var conceptoFactura = factura.get(1)
        var impuestoFactura = factura.get(2)
        var totalFactura = factura.get(3)
        var recibiconformeFactura = factura.get(4)


        var nombreItem = item.get(0)
        var descripcionItem = item.get(1)
        var cantidadItem = item.get(2)
        var precioItem = item.get(3)
        var descuentoItem = item.get(4)









        /*FACTURA*/
        fun crearFactura(){
            crud_factura_crear().tv_resultados_factura2.setText("Factura Creada exitosamente!")



        }

        fun leerFactura(){

           crud_factura_crear().tv_resultados_factura.setText(
                Companion.nombreItem + Companion.descripcionItem
                    + Companion.cantidadItem + Companion.precioItem +
                    Companion.descuentoItem)

        }

        fun actualizarFactura(){
            crud_factura_crear().tv_resultados_factura4.setText("Ingrese dato que necesita actualizar")
        }

        fun borrarFactura(){
            item = emptyArray()
            crud_factura_crear().tv_resultados_factura2.setText("Factura Eliminada")

        }

        /*ITEM*/

        fun crearItem(){
            item = emptyArray()
            crud_factura_crear().tv_resultados_factura2.setText("Item Creado exitosamente!")

        }

        fun leerItem(){

            crud_factura_crear().tv_resultados_factura.setText(
                Companion.numeroFactura + Companion.conceptoFactura
                        + Companion.impuestoFactura + Companion.totalFactura +
                        Companion.recibiconformeFactura)

        }

        fun actualizarItem(){
            crud_factura_crear().tv_resultados_factura4.setText("Ingrese dato que necesita actualizar")
        }

        fun borrarItem(){
            item = emptyArray()
            crud_factura_crear().tv_resultados_factura2.setText("Item Eliminado")

        }

    }
}