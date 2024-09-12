package com.example.heroesapp.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.models.Hero
import com.squareup.picasso.Picasso

class HeroesAdapter (val heroList : List<Hero>, val onClick : (Hero) -> Unit) : RecyclerView.Adapter<HeroesViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.hero_item,parent,false)
        return HeroesViewHolder(view)
    }

    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        val hero = heroList[position]
        holder.heroName.text = hero.name.uppercase()
        Picasso.get().load(hero.image).into(holder.heroImage)
        holder.itemView.setOnClickListener{
            Log.i("Heroe",hero.name)
            onClick(hero)
        }
    }

    override fun getItemCount(): Int {
        return heroList.count()
    }

}

class HeroesViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    val heroImage : ImageView = view.findViewById(R.id.hero_card_img)
    val heroName : TextView = view.findViewById(R.id.hero_card_name)
}