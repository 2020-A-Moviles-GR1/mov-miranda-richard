package com.example.examencrudfactura2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_factura.*

class Menu_factura : AppCompatActivity() {

    fun result_crudFactura(){
        val intent_Explicito2 = Intent(this, crud_factura_crear::class.java)
        startActivity(intent_Explicito2)

    }
    fun result_crudFactura2(){
        val intent_Explicito3 = Intent(this, crud_factura_leer::class.java)
        startActivity(intent_Explicito3)

    }
    fun result_crudFactura3(){
        val intent_Explicito4 = Intent(this, crud_factura_borrar::class.java)
        startActivity(intent_Explicito4)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_factura)

        btn_fact_crear.setOnClickListener { result_crudFactura()}

        btn_fact_leer.setOnClickListener { result_crudFactura2()}
        btn_fact_actualizar.setOnClickListener {result_crudFactura()}
        btn_fact_borrar.setOnClickListener {result_crudFactura3()}

        btn_fact_regresar.setOnClickListener { boton2 -> onBackPressed() }
        btn_fact_salir.setOnClickListener { boton2 -> System.exit(0) }
    }
}