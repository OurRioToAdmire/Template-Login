package com.example.somosmaravilla

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.index)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        lateinit var paswer: EditText
        lateinit var btn_login: Button
        lateinit var username: EditText

        paswer = findViewById(R.id.paswer)



        btn_login.setOnClickListener{
            if(username.text.toString().isEmpty() || paswer.text.toString().isEmpty()){
                showMessage(0)
            }else if(!username.text.matches(Simpleton.arrvalid.get(0).toRegex())){
                showMessage(1)
            }else if(!username.text.toString().contentEquals(Simpleton.user_def)
                && paswer.text.toString().contentEquals(Simpleton.paswer_def)){
                startActivity(Intent(this, MainActivity2::class.java))
            }
        }

    }
    fun showMessage(index: Int){
        var builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage(Simpleton.arrmsj.get(index))
        builder.setCancelable(false)
        builder.setIcon(R.drawable.ic_launcher_foreground)

        //buttons

        builder.setPositiveButton("ok"){dialog, which -> dialog.dismiss()}
        builder.setNegativeButton("No"){dialog, which -> dialog.dismiss()}

        var dialog = builder.create()
        dialog.show()
    }
}