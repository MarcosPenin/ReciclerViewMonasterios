package com.example.reciclyngview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reciclyngview.databinding.ActivityMainBinding
import com.example.reciclyngview.lista.ListaActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.enlaceLista.setOnClickListener {
            startActivity(Intent(this, ListaActivity::class.java))
        }

    }
}