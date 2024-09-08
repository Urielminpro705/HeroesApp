package com.example.heroesapp.ui

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R

class HomeActivity : AppCompatActivity (){
    lateinit var logoutBtn : ImageView
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        val sharedPreferences = getSharedPreferences("mypreferences", MODE_PRIVATE)
        logoutBtn = findViewById(R.id.logoutBtn)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            // Cambio de color de la barra de estado, la de navegacion y la linea que divide la barra de navegacion
            window.statusBarColor = ContextCompat.getColor(this, R.color.translucent_blue)
            window.navigationBarColor = ContextCompat.getColor(this, R.color.dark_blue)
            window.navigationBarDividerColor = ContextCompat.getColor(this, R.color.red)
            insets
        }

        logoutBtn.setOnClickListener{
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@HomeActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}