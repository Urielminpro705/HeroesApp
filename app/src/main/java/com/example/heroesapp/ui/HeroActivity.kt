package com.example.heroesapp.ui

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
import com.example.heroesapp.R
import com.example.heroesapp.models.Hero
import com.squareup.picasso.Picasso

class HeroActivity() : AppCompatActivity() {
    lateinit var heroNameTV : TextView
    lateinit var heroBigNameTV : TextView
    lateinit var heroDescriptionTV : TextView
    lateinit var heroImg : ImageView

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hero)
        heroNameTV = findViewById(R.id.hero_name)
        heroBigNameTV = findViewById(R.id.hero_big_name)
        heroDescriptionTV = findViewById(R.id.hero_description)
        heroImg = findViewById(R.id.hero_img)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            // Cambio de color de la barra de estado, la de navegacion y la linea que divide la barra de navegacion
            window.statusBarColor = ContextCompat.getColor(this, R.color.translucent_blue)
            window.navigationBarColor = ContextCompat.getColor(this, R.color.dark_blue)
            window.navigationBarDividerColor = ContextCompat.getColor(this, R.color.red)
            insets
        }

        val heroId = intent.getIntExtra("heroId",0)
        Log.i("HeroActivity","El id del heroe es ${heroId.toString()}")
        val hero = Hero.heroes.firstOrNull { it.id == heroId }
        Picasso.get().load(hero?.image).into(heroImg)
        heroNameTV.text = hero?.name
        heroBigNameTV.text = hero?.name?.uppercase()
        heroDescriptionTV.text = hero?.description
    }
}
