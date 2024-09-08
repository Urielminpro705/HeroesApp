package com.example.heroesapp.models

data class Publisher(val id : Int, val name : String, val imageLogo : String, val imageBackground : String){
    companion object {
        val publishers = mutableListOf<Publisher>(
            Publisher(1,"Marvel", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Marvel_Logo.svg/1200px-Marvel_Logo.svg.png","https://uswalldecor.com/cdn/shop/products/DI0944_73ec5c7a-6d68-4613-a5da-4a32fd26279b.jpg?v=1581370087&ampwidth=823"),
            Publisher(2,"DC",  "https://upload.wikimedia.org/wikipedia/commons/1/1c/DC_Comics_logo.png","https://images2.alphacoders.com/446/446666.jpg")
        )
    }
}
