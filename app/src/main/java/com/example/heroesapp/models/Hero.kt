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
        )
    }
}
