package com.example.heroesapp.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.models.Hero
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso
import java.util.Locale.Category

class PublisherAdapter(val publisherList : List<Publisher>, val onClick : (Publisher) -> Unit) : RecyclerView.Adapter<PublisherViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item,parent, false)
        return PublisherViewHolder(view)
    }

    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val publisher = publisherList[position]
        Picasso.get().load(publisher.imageLogo).into(holder.publisherLogo)
        Picasso.get().load(publisher.imageBackground).into(holder.publisherBG)
        holder.itemView.setOnClickListener{
            Log.i("Publicadora", publisher.name)
            onClick(publisher)
        }
    }

    override fun getItemCount(): Int {
        return publisherList.count()
    }

}

class PublisherViewHolder(view : View) : RecyclerView.ViewHolder(view) {
    val publisherLogo : ImageView = view.findViewById(R.id.publisher_logo)
        val publisherBG : ImageView = view.findViewById(R.id.publisher_background)
}