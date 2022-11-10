package com.example.ejercicio3fer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val boton1 = findViewById<Button>(R.id.btn1)
    val edtext1 = findViewById<EditText>(R.id.ed1)
    val swt1 = findViewById<SwitchCompat>(R.id.switch1)

        boton1.setOnClickListener {
            if (edtext1.text.isEmpty()){
                Toast.makeText(this, "El texto está vacío", Toast.LENGTH_SHORT).show()
            }
            else {
                if (swt1.isChecked){
                    val snack = Snackbar.make(it,"Hola ${edtext1.text}",Snackbar.LENGTH_LONG)
                    snack.show()
                }
                else{
                    Toast.makeText(this, "Hola ${edtext1.text}", Toast.LENGTH_SHORT).show()
                }
            }
        }


    }






}