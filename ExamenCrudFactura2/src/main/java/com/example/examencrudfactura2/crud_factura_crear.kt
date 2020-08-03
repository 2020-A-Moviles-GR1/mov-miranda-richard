package com.example.examencrudfactura2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_menu_factura.*
import kotlinx.android.synthetic.main.activity_resultado_crud_factura.*
import com.example.examencrudfactura2.servicioBaseDeDatos.Companion as servicioBaseDeDatos

class crud_factura_crear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_crud_factura)

        tv_resultados_factura2.setText("Factura Creada exitosamente!")

        btn_fact_regresar2.setOnClickListener { boton2 -> onBackPressed() }
        btn_fact_salir2.setOnClickListener { boton2 -> System.exit(0) }
    }
}