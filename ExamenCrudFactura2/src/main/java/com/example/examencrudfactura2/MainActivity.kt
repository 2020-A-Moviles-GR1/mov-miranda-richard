package com.example.examencrudfactura2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    fun crudFactura(){
        val intent_Explicito1 = Intent(this, Menu_factura::class.java)
        startActivity(intent_Explicito1)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1_fact.setOnClickListener { crudFactura() }


    }
}