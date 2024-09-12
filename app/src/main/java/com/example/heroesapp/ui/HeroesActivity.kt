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
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroesAdapter
import com.example.heroesapp.models.Hero
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso

class HeroesActivity : AppCompatActivity() {
    lateinit var heroesRecyclerView : RecyclerView
    lateinit var publisherImageView : ImageView
    lateinit var publisherLogoImageView : ImageView
    lateinit var publisherTV : TextView
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)
        heroesRecyclerView = findViewById(R.id.heroes_recyclerView)
        publisherImageView = findViewById(R.id.publisher_banner)
        publisherLogoImageView = findViewById(R.id.publisher_banner_logo)
        publisherTV = findViewById(R.id.heroes_publisher_name)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            // Cambio de color de la barra de estado, la de navegacion y la linea que divide la barra de navegacion
            window.statusBarColor = ContextCompat.getColor(this, R.color.translucent_blue)
            window.navigationBarColor = ContextCompat.getColor(this, R.color.translucent_blue)
            window.navigationBarDividerColor = ContextCompat.getColor(this, R.color.red)
            insets
        }

        val publisherId = intent.getIntExtra("publisherId", 0)
        Log.i("HeroesActivity","El ID es ${publisherId.toString()}")
        val publisher = Publisher.publishers.firstOrNull{it.id == publisherId}
        Picasso.get().load(publisher?.imageBackground).into(publisherImageView)
        Picasso.get().load(publisher?.imageLogo).into(publisherLogoImageView)
        publisherTV.text = buildString {
            append(publisherTV.text.toString())
            append(" ${publisher?.name}".uppercase())
        }
        Log.i("El publisher",publisher.toString())
        val heroes = Hero.heroes.filter { it.idPublisher == publisherId }
        heroesRecyclerView.adapter = HeroesAdapter(heroes) { hero ->
            Log.i("HerosActivityHero",hero.name)
            val intent = Intent(this@HeroesActivity, HeroActivity::class.java).apply{
                putExtra("heroId",hero.id)
            }

            startActivity(intent)
        }
        heroesRecyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}