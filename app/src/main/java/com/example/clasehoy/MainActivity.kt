package com.example.clasehoy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<TextView>(R.id.prueba)

        val boton = findViewById<Button>(R.id.button)

        val fondo = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.jaja)



        boton.setOnClickListener{
            texto.text = "Caca"
            fondo.setBackgroundColor(resources.getColor(R.color.black))
            texto.setTextColor(resources.getColor(R.color.white))

        }
    }
}