package com.example.ejercicio3fer

import com.example.ejercicio3fer.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            if (binding.ed1.text.isEmpty()){
                Toast.makeText(this, "El texto está vacío", Toast.LENGTH_SHORT).show()
            }
            else {
                if (binding.switch1.isChecked){
                    Snackbar.make(it,"Hola ${binding.ed1.text}",Snackbar.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this, "Hola ${binding.ed1.text}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }






}