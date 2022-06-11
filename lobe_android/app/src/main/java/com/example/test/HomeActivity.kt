package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class HomeActivity : AppCompatActivity() {

    private lateinit var btnContinuar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        //Obtenemos una referencia a los controles de la interfaz
        btnContinuar = findViewById(R.id.showInput)

        btnContinuar.setOnClickListener {
            //Creamos el Intent
            val intent = Intent(this@HomeActivity, DetectorActivity::class.java)
            //Iniciamos la nueva actividad
            startActivity(intent)
        }
    }
}