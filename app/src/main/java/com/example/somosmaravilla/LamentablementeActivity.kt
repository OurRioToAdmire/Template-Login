package com.example.somosmaravilla

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LamentablementeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.lamentablemente)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.lam)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        lateinit var finalname: TextView
        lateinit var finalfecha: TextView
        lateinit var finallanguage: TextView

        finalname = findViewById(R.id.finalname)
        finalfecha = findViewById(R.id.finalfecha)
        finallanguage = findViewById(R.id.finallanguage)

        finalname.setText(Simpleton.finalname)
        finalfecha.setText(Simpleton.finalfecha)
        finallanguage.setText(Simpleton.finallanguage)
    }
}