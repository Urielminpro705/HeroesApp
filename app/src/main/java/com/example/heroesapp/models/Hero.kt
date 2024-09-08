package com.example.heroesapp.models

data class Hero(val id : Int, val name : String, val description : String, val image : String, val idPublisher : Int) {
    companion object{
        val heroes = mutableListOf(
            Hero(1,"Deadpool",""+
                    "Wade Winston Wilson, más conocido como Deadpool,, un antiguo mercenario mentalmente " +
                    "inestable y desfigurado famoso por gozar de un sentido del humor poco convencional, " +
                    "unos poderes de sanación acelerados, " +
                    "una naturaleza charlatana y cierta tendencia a romper la cuarta pared.", "" +
                    "https://clipart-library.com/images/6cyGj89cn.png", 1),
            Hero(2,"Iron man","Anthony Edward (Tony Stark) es un multimillonario magnate empresarial y filántropo " +
                    "estadounidense, playboy e ingenioso científico, que sufrió una grave lesión en el pecho durante un secuestro en el " +
                    "Medio Oriente. Cuando sus captores intentaron forzarlo a construir un arma de destrucción masiva, elaboró, en " +
                    "cambio, una armadura para salvar su vida y escapar del cautiverio. Más tarde, Stark desarrolló su traje, agregando " +
                    "armas y otros dispositivos tecnológicos que diseñaba a través de su compañía Industrias Stark. Usa el traje y " +
                    "las versiones sucesivas para proteger al mundo como Iron Man. Aunque al principio ocultó su verdadera identidad, " +
                    "Stark finalmente declaró quién era en un anuncio público, que conmocionó a los allí presentes.","" +
                    "https://i.pinimg.com/originals/b8/79/9b/b8799b58221cf451026e6b9fee336d95.png",1),
            Hero(3,"Wolverine","Nacido con sentidos aumentados, garras retractiles y un increíble factor de curación, " +
                    "el hombre conocido como Logan, fue sometido aun procedimiento que unió un indestructible metal a su esqueleto, volviéndolo " +
                    "incluso un más formidable guerrero , Wolverine!","" +
                    "https://pngimg.com/uploads/wolverine/wolverine_PNG37.png", 1),
            Hero(4,"Capitan america","Steve Rogers, un joven frágil que fue mejorado a la cima de la perfección humana por un suero " +
                    "experimental S.S.S. (Suero supersoldado) para ayudar a los esfuerzos inminentes del gobierno de Estados Unidos en la Segunda " +
                    "Guerra Mundial. Cerca del final de la guerra, queda atrapado en el hielo y sobrevive en animación suspendida hasta que es " +
                    "descongelado en el presente","https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/4f7fb8ac-ed8a-4476-911c-c81affaa3f15/d" +
                    "foylkt-a7528c05-6220-4674-b1f3-676d97abddef.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzN" +
                    "zNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzRmN2ZiOGFjL" +
                    "WVkOGEtNDQ3Ni05MTFjLWM4MWFmZmFhM2YxNVwvZGZveWxrdC1hNzUyOGMwNS02MjIwLTQ2NzQtYjFmMy02NzZkOTdhYmRkZWYucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2a" +
                    "WNlOmZpbGUuZG93bmxvYWQiXX0.cuUUjQNnFlHLlvgbEupPiJsZDvbk5wkEB1jo1KOqR2s",1)
        )
    }
}
