package com.example.somosmaravilla

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import javax.xml.namespace.QName
import java.util.Locale
lateinit var name: TextInputEditText
lateinit var edad: TextInputEditText
lateinit var RFC: TextInputEditText
lateinit var telefono: TextInputEditText
lateinit var espinner: Spinner
lateinit var city: Spinner
lateinit var obstacle2: Button
lateinit var fecha: TextInputEditText
lateinit var inpaswelay: TextInputLayout
lateinit var innom: TextInputEditText
lateinit var inpaswe: TextInputEditText
lateinit var innomlay: TextInputLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        name = findViewById(R.id.name)
        edad = findViewById(R.id.age)
        RFC = findViewById(R.id.RFC)
        telefono = findViewById(R.id.telefono)
        obstacle2 = findViewById<Button>(R.id.obstacle2)
        fecha = findViewById(R.id.fecha)

        inpaswe = findViewById(R.id.inpaswe)



        //buddon
        fecha.setOnClickListener {
            mostrarCalendario(fecha)
        }

        espinner = findViewById<Spinner>(R.id.espinner)
        city = findViewById<Spinner>(R.id.city)

        var adatpr = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            Simpleton.arrleng
        )
        adatpr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        var ada = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            Simpleton.cities
        )
        adatpr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        espinner.adapter = adatpr
        city.adapter = ada

        espinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Simpleton.finallanguage = Simpleton.arrleng[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        obstacle2.setOnClickListener {
            if (edad.text.toString().matches(Simpleton.arrvalid.get(1).toRegex())){
                    Toast.makeText(this, "erm...", Toast.LENGTH_LONG).show()
                }

            if (telefono.text.toString().matches(Simpleton.arrvalid.get(3).toRegex())){
                    Toast.makeText(this,"no", Toast.LENGTH_LONG)

            }
            if(inpaswe.text.contentEquals("1234")){
                inpaswelay.error = null
            }else{
                inpaswelay.error = "Password Incorrectooooou"
            }

            Simpleton.finalname = name.text.toString()
            Simpleton.finalfecha = fecha.text.toString()

            startActivity(Intent())

            startActivity(Intent(this, LamentablementeActivity::class.java))
        }

    }
    fun mostrarCalendario(textView: TextView){
        val calendario = Calendar.getInstance()
        var anio_act = calendario.get(Calendar.YEAR)
        var mes_act = calendario.get(Calendar.MONTH)
        var dia_act = calendario.get(Calendar.DAY_OF_MONTH)
        var datePickerDialog = DatePickerDialog(
            this,
            {_, anio, mes, dia -> calendario.set(anio, mes, dia)
            val formato = SimpleDateFormat("dd/MM/YYYY", Locale.getDefault())
                val fechaString = formato.format(calendario.time)
                textView.text = fechaString.toString();
            },
            anio_act,
            mes_act,
            dia_act
        )
        datePickerDialog.show()
    }
}