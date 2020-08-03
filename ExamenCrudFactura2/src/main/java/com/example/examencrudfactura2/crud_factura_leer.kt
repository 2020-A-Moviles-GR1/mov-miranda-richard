package com.example.examencrudfactura2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_crud_factura_leer.*
import kotlinx.android.synthetic.main.activity_resultado_crud_factura.*

class crud_factura_leer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crud_factura_leer)

        tv_resultados_factural1.setText(servicioBaseDeDatos.numeroFactura)
        tv_resultados_factural2.setText(servicioBaseDeDatos.conceptoFactura)
        tv_resultados_factural3.setText(servicioBaseDeDatos.impuestoFactura)
        tv_resultados_factural4.setText(servicioBaseDeDatos.totalFactura)
        tv_resultados_factural5.setText(servicioBaseDeDatos.recibiconformeFactura)


        btn_fact_regresar4.setOnClickListener { boton2 -> onBackPressed() }
        btn_fact_salir4.setOnClickListener { boton2 -> System.exit(0) }
    }
}