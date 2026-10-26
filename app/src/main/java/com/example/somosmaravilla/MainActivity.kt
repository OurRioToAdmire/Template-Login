package com.example.somosmaravilla

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log
import androidx.lifecycle.Lifecycle.Event.Companion.downTo
import android.widget.*

val tag_utt: String = "AppUTT6A"

lateinit var titulo: TextView
lateinit var paterno: EditText
lateinit var materno: EditText
lateinit var nombre: EditText
lateinit var timber: Button

//import com.example.somosmaravilla.Singleton.paswer
val val_bool = true
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.index)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        titulo = findViewById(R.id.titulo)
        nombre = findViewById(R.id.nombre)
        paterno = findViewById(R.id.paterno)
        materno = findViewById(R.id.materno)
        timber = findViewById(R.id.timber)


        timber.setOnClickListener {
            titulo.setText("Tu nombre completo es: " + nombre.text.toString() + ""+ paterno.text.toString() +""+ materno.text.toString())
        }





        val variable1 = 5 > 10
        if(val_bool){

            Log.d(tag_utt, "real y tru")
        } else{
            Log.d(tag_utt, "clickbait")
        }
        fun sumar(num1: Int, num2: Int, num3: Int): Int{
            return num1+num2+num3
        }
        var resultado = sumar(1, 2 ,3)
        resultado = sumar(num1=4, num2=10, num3=7)
        Log.d(tag_utt, "El resultado es $resultado")


        var dias = arrayOf("Lunes",  "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
        Log.d(tag_utt, "El dia es ${dias[0]}")

        if(dias[1] == "Lunes"){
            Log.d(tag_utt, "El dia es ${dias[0]}")
        }
        when(dias[0]){
            "Lunes" -> Log.d(tag_utt, "El dia es Lunes")
            "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" -> Log.d(tag_utt, "El dia no es ${dias[0]}")

        }
        var edad=4
        if(edad > 17) Log.d(tag_utt, "Es mayor de edad.") else Log.d(tag_utt, "No es mayor de edad")
        when{
            edad > 17 -> Log.d(tag_utt, "Es mayor de edad")
            else -> Log.d(tag_utt, "No es mayor de edad")
        }
        if(edad < 3 ) Log.d(tag_utt, "No va a la escuela") else if (edad >= 3 && edad <= 5) Log.d(tag_utt, "Kinder")
        if (edad >= 3 && edad <= 5) Log.d(tag_utt, "Primaria")
        if (edad >= 6 && edad <= 12) Log.d(tag_utt, "Secundaria")
        if (edad >= 11 && edad <= 14) Log.d(tag_utt, "Preparatoria")
        if (edad >= 13 && edad <= 18) Log.d(tag_utt, "Universidad")

        var grade_escol: String = when{
            edad < 3 -> "No va a la escuela"
            edad in 3 .. 5 -> "Kinder"
            edad in 6 .. 12 -> "Primaria"
            edad in 13 .. 15 -> "Secundaria"
            edad in 16 .. 18 -> "Preparatoria"
            else -> "Universidad"
        }
        Log.d(tag_utt, "El grado escolar es $grade_escol")

        for (x in 0 .. 10) Log.d(tag_utt, "x = $x")

        for(y in 10 downTo 2) Log.d(tag_utt, "y = $y")

        for(z in 10 until 2) Log.d(tag_utt, "y = $z")

        for (x in 10 until 20 step 2) Log.d(tag_utt, "x = $x")

        for (x in 0 .. dias.lastIndex) Log.d(tag_utt, "x = $x")

    }
}