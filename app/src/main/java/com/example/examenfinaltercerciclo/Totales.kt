package com.example.examenfinaltercerciclo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Totales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_totales)

        val tvNPT1: TextView = findViewById(R.id.tvNPT1)
        val tvNPT2: TextView = findViewById(R.id.tvNPT2)
        val tvNPT3: TextView = findViewById(R.id.tvNPT3)

        val tvCPT1: TextView = findViewById(R.id.tvCPT1)
        val tvCPT2: TextView = findViewById(R.id.tvCPT2)
        val tvCPT3: TextView = findViewById(R.id.tvCPT3)

        val tvPPT1: TextView = findViewById(R.id.tvPPT1)
        val tvPPT2: TextView = findViewById(R.id.tvPPT2)
        val tvPPT3: TextView = findViewById(R.id.tvPPT3)
        val tvPTP3: TextView = findViewById(R.id.tvPTP3)
        val btnRegresar: Button = findViewById(R.id.btnRegresar)

        val cp1 = intent.getIntExtra("CP1",0)
        val cp2 = intent.getIntExtra("CP2",0)
        val cp3 = intent.getIntExtra("CP3",0)

        val np1 = intent.getStringExtra("NP1")
        val np2 = intent.getStringExtra("NP2")
        val np3 = intent.getStringExtra("NP3")

        val pp1 = intent.getDoubleExtra("PP1", 0.0)
        val pp2 = intent.getDoubleExtra("PP2", 0.0)
        val pp3 = intent.getDoubleExtra("PP3", 0.0)

        tvNPT1.text = np1
        tvNPT2.text = np2
        tvNPT3.text = np3

        tvCPT1.text = cp1.toString()
        tvCPT2.text = cp2.toString()
        tvCPT3.text = cp3.toString()

        val totalP1 = pp1 * cp1
        val totalP2 = pp2 * cp2
        val totalP3 = pp3 * cp3

        tvPPT1.text = totalP1.toString()
        tvPPT2.text = totalP2.toString()
        tvPPT3.text = totalP3.toString()

        tvPTP3.text = (totalP1+totalP2+totalP3).toString()

        btnRegresar.setOnClickListener(){
            finish()
        }
    }
}