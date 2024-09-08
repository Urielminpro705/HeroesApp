package com.example.heroesapp

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.models.User
import com.example.heroesapp.ui.HomeActivity

class MainActivity : AppCompatActivity() {
    lateinit var loginBtn : Button
    lateinit var emailInput : EditText
    lateinit var passwordInput : EditText
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        setContentView(R.layout.activity_main)
        val sharedPreferences = getSharedPreferences("mypreferences", MODE_PRIVATE)
        val isLogged = sharedPreferences.getBoolean("isLogged", false)
        val intent = Intent(this@MainActivity, HomeActivity::class.java)
        if(isLogged){
            startActivity(intent)
            finish()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            // Cambio de color de la barra de estado, la de navegacion y la linea que divide la barra de navegacion
            window.statusBarColor = ContextCompat.getColor(this, R.color.dark_blue)
            window.navigationBarColor = ContextCompat.getColor(this, R.color.dark_blue)
            window.navigationBarDividerColor = ContextCompat.getColor(this, R.color.grey_blue)
            insets
        }

        loginBtn = findViewById(R.id.loginBtn)
        emailInput = findViewById(R.id.email_input)
        passwordInput = findViewById(R.id.password_input)

        loginBtn.setOnClickListener{
            Log.i("LOGAPP", "Inicio de sesion")
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()
            Log.i("EMAIL",email)
            Log.i("PASSWORD",password)
            if (email.isEmpty() || password.isEmpty()){
                Log.i("ERROR","El email o la contraseña estan vacios")
                return@setOnClickListener
            }
            val isValidUser = User.staticUsers.any { user ->
                user.email == email && user.password == password
            }
            if (!isValidUser) {
                Log.i("ERROR","El correo y la contraseña no coinciden")
                return@setOnClickListener
            }
            val user = User.staticUsers.firstOrNull(){ user ->
                user.email == email && user.password == password
            }

            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", true)
            editor.putString("userName", user?.email)
            editor.apply()
            startActivity(intent)
            finish()
        }
    }
}