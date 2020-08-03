package com.example.examencrudfactura2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado_crud_factura.*
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_crud_factura_borrar.*
import kotlinx.android.synthetic.main.activity_menu_factura.*
import kotlinx.android.synthetic.main.activity_resultado_crud_factura.*
import com.example.examencrudfactura2.servicioBaseDeDatos.Companion as servicioBaseDeDatos

class crud_factura_borrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crud_factura_borrar)

        tv_resultados_facturab.setText("Factura Eliminada")
        btn_fact_regresar3.setOnClickListener { boton2 -> onBackPressed() }
        btn_fact_salir3.setOnClickListener { boton2 -> System.exit(0) }
    }
}