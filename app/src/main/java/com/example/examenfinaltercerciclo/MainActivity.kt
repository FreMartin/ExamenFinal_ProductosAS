package com.example.examenfinaltercerciclo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p1 = Producto("Pelota", 10, 15.50)
        val p2 = Producto("Dinosaurio", 15, 30.22)
        val p3 = Producto("Hot Wheels", 12, 12.35)

        val tvNP1: TextView = findViewById(R.id.tvNP1)
        val tvNP2: TextView = findViewById(R.id.tvNP2)
        val tvNP3: TextView = findViewById(R.id.tvNP3)

        val tvCP1: TextView = findViewById(R.id.tvCP1)
        val tvCP2: TextView = findViewById(R.id.tvCP2)
        val tvCP3: TextView = findViewById(R.id.tvCP3)

        val tvPP1: TextView = findViewById(R.id.tvPP1)
        val tvPP2: TextView = findViewById(R.id.tvPP2)
        val tvPP3: TextView = findViewById(R.id.tvPP3)
        val ventanaTotales = Intent(this, Totales::class.java)

        tvNP1.text = p1.nombre
        tvNP2.text = p2.nombre
        tvNP3.text = p3.nombre

        tvCP1.text = p1.cantidad.toString()
        tvCP2.text = p2.cantidad.toString()
        tvCP3.text = p3.cantidad.toString()

        tvPP1.text = p1.precio.toString()
        tvPP2.text = p2.precio.toString()
        tvPP3.text = p3.precio.toString()

        val fbMinP1: ExtendedFloatingActionButton = findViewById(R.id.fbMinP1)
        val fbMinP2: ExtendedFloatingActionButton = findViewById(R.id.fbMinP2)
        val fbMinP3: ExtendedFloatingActionButton = findViewById(R.id.fbMinP3)

        val fbMaxP1: ExtendedFloatingActionButton = findViewById(R.id.fbMaxP1)
        val fbMaxP2: ExtendedFloatingActionButton = findViewById(R.id.fbMaxP2)
        val fbMaxP3: ExtendedFloatingActionButton = findViewById(R.id.fbMaxP3)

        val btnComprar: Button = findViewById(R.id.btnComprar)

        val tvCantP1: TextView = findViewById(R.id.tvCantP1)
        val tvCantP2: TextView = findViewById(R.id.tvCantP2)
        val tvCantP3: TextView = findViewById(R.id.tvCantP3)

        fbMinP1.setOnClickListener(){
            var cantP1 = tvCantP1.text.toString().toInt()
            var cantTotalP1 = tvCP1.text.toString().toInt()

            if (cantP1>0){
                cantP1 --
                cantTotalP1 ++
                tvCantP1.text = cantP1.toString()
                tvCP1.text = cantTotalP1.toString()
            }
        }

        fbMaxP1.setOnClickListener(){
            var cantP1 = tvCantP1.text.toString().toInt()
            var cantTotalP1 = tvCP1.text.toString().toInt()

            if (cantP1>=0 && cantP1 < p1.cantidad){
                cantP1 ++
                cantTotalP1 --
                tvCantP1.text = cantP1.toString()
                tvCP1.text = cantTotalP1.toString()
            }
        }


        fbMinP2.setOnClickListener(){
            var cantP2 = tvCantP2.text.toString().toInt()
            var cantTotalP2 = tvCP2.text.toString().toInt()

            if (cantP2>0){
                cantP2 --
                cantTotalP2 ++
                tvCantP2.text = cantP2.toString()
                tvCP2.text = cantTotalP2.toString()
            }
        }

        fbMaxP2.setOnClickListener(){
            var cantP2 = tvCantP2.text.toString().toInt()
            var cantTotalP2 = tvCP2.text.toString().toInt()

            if (cantP2>=0 && cantP2 < p2.cantidad){
                cantP2 ++
                cantTotalP2 --
                tvCantP2.text = cantP2.toString()
                tvCP2.text = cantTotalP2.toString()
            }
        }

        fbMinP3.setOnClickListener(){
            var cantP3 = tvCantP3.text.toString().toInt()
            var cantTotalP3 = tvCP3.text.toString().toInt()

            if (cantP3>0){
                cantP3 --
                cantTotalP3 ++
                tvCantP3.text = cantP3.toString()
                tvCP3.text = cantTotalP3.toString()
            }
        }

        fbMaxP3.setOnClickListener(){
            var cantP3 = tvCantP3.text.toString().toInt()
            var cantTotalP3 = tvCP3.text.toString().toInt()

            if (cantP3>=0 && cantP3 < p3.cantidad){
                cantP3 ++
                cantTotalP3 --
                tvCantP3.text = cantP3.toString()
                tvCP3.text = cantTotalP3.toString()
            }
        }

        btnComprar.setOnClickListener(){

            ventanaTotales.putExtra("NP1", p1.nombre)
            ventanaTotales.putExtra("NP2", p2.nombre)
            ventanaTotales.putExtra("NP3", p3.nombre)

            ventanaTotales.putExtra("CP1", tvCantP1.text.toString().toInt())
            ventanaTotales.putExtra("CP2", tvCantP2.text.toString().toInt())
            ventanaTotales.putExtra("CP3", tvCantP3.text.toString().toInt())

            ventanaTotales.putExtra("PP1", p1.precio.toString().toDouble())
            ventanaTotales.putExtra("PP2", p2.precio.toString().toDouble())
            ventanaTotales.putExtra("PP3", p3.precio.toString().toDouble())

            startActivity(ventanaTotales)
        }

    }
}