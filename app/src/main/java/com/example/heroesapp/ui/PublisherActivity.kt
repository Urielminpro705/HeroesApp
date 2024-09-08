package com.example.heroesapp.ui

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.adapters.PublisherAdapter
import com.example.heroesapp.adapters.PublisherViewHolder
import com.example.heroesapp.models.Hero
import com.example.heroesapp.models.Publisher

class PublisherActivity : AppCompatActivity (){
    lateinit var logoutBtn : ImageView
    lateinit var userName : TextView
    lateinit var publisherRecyclerView: RecyclerView
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_publisher)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            // Cambio de color de la barra de estado, la de navegacion y la linea que divide la barra de navegacion
            window.statusBarColor = ContextCompat.getColor(this, R.color.translucent_blue)
            window.navigationBarColor = ContextCompat.getColor(this, R.color.dark_blue)
            window.navigationBarDividerColor = ContextCompat.getColor(this, R.color.red)
            insets
        }

        val sharedPreferences = getSharedPreferences("mypreferences", MODE_PRIVATE)
        val userNameShared = sharedPreferences.getString("userName","")
        userName = findViewById(R.id.nameTV)
        logoutBtn = findViewById(R.id.logoutBtn)
        publisherRecyclerView = findViewById(R.id.publishers_recyclerview)
        publisherRecyclerView.adapter = PublisherAdapter(Publisher.publishers) { publisher ->
            Log.i("PublisherActivityHeroes", publisher.name)
            val intent = Intent(this@PublisherActivity, HeroesActivity::class.java).apply{
                putExtra("publisherId",publisher.id)
            }

            startActivity(intent)
        }

        publisherRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        userName.text = buildString {
            append(userName.text.toString())
            append(" $userNameShared")
        }



        logoutBtn.setOnClickListener{
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@PublisherActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}