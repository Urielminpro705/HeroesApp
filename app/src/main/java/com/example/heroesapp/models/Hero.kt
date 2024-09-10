package com.example.heroesapp.models

data class Hero(val id : Int, val name : String, val description : String, val image : String, val idPublisher : Int) {
    companion object{
        val heroes = mutableListOf(
            Hero(1,"Deadpool",""+
                    "Wade Wilson, conocido como Deadpool, es un mercenario con una habilidad única para sanar rápidamente de cualquier " +
                    "herida, gracias a un experimento que le otorgó un factor de curación mejorado. Conocido por su comportamiento " +
                    "excéntrico y su tendencia a romper la cuarta pared, Deadpool combina una gran habilidad en combate con un sentido " +
                    "del humor oscuro y una actitud irreverente. Aunque a menudo actúa como un antiheroico y desprecia las reglas, su " +
                    "factor de curación le permite sobrevivir a situaciones extremadamente peligrosas y enfrentarse a enemigos formidables. " +
                    "A pesar de su exterior caótico, Wade busca su propio sentido de propósito y redención mientras navega por el mundo " +
                    "del crimen y la heroísmo.", "https://clipart-library.com/images/6cyGj89cn.png", 1),
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
                    "WNlOmZpbGUuZG93bmxvYWQiXX0.cuUUjQNnFlHLlvgbEupPiJsZDvbk5wkEB1jo1KOqR2s",1),
            Hero(5,"Spider man","Peter Parker, un joven estudiante de secundaria, adquiere habilidades sobrehumanas después de ser mordido " +
                    "por una araña radioactiva. Desarrolla fuerza, agilidad, y la capacidad de trepar paredes, lo que lo lleva a convertirse en el héroe " +
                    "conocido como Spider-Man. Después de la trágica muerte de su tío Ben, Peter asume la responsabilidad de usar sus poderes para proteger " +
                    "a los demás, guiado por el principio de que \"con gran poder viene gran responsabilidad\". Equilibra su vida como estudiante y " +
                    "superhéroe mientras lucha contra diversos villanos en la ciudad de Nueva York.","https://purepng.com/public/uploads/large/purepng." +
                    "com-spiderman-comicspider-manspidermansuperherocomic-bookmarvel-comicscharacterstan-leegamesmovie-17015286563624c4rm.png",1),
            Hero(6,"Domino","" +
                    "Neena Thurman, también conocida como Domino, es una mercenaria mutante con la habilidad única de manipular la probabilidad a su favor, lo " +
                    "que le otorga una suerte increíble en situaciones de alto riesgo. Fue parte de un experimento gubernamental que alteró su genética, dándole " +
                    "sus poderes. Con un entrenamiento militar avanzado y su capacidad para que todo salga a su favor en combate, se convierte en una letal " +
                    "luchadora y estratega. A lo largo de su vida, ha trabajado como parte de equipos como X-Force, enfrentando a poderosos enemigos mientras navega " +
                    "por su complicado pasado.","https://static.wikia.nocookie.net/characterprofile/images/1/16/Domino_%28Marvel_Comics%29_render.png/revision/" +
                    "latest/scale-to-width-down/742?cb=20230814031725",1),
            Hero(7,"Daredevil","Matt Murdock, un joven abogado de Hell’s Kitchen, pierde la vista en un accidente cuando era niño al " +
                    "ser expuesto a productos químicos radiactivos. Aunque queda ciego, sus otros sentidos se amplifican a niveles sobrehumanos, dándole una percepción " +
                    "casi perfecta de su entorno. Inspirado por la trágica muerte de su padre, Matt se convierte en el vigilante conocido como Daredevil, luchando " +
                    "contra el crimen en las calles de Nueva York mientras equilibra su vida como defensor de la justicia tanto en los tribunales como en las azoteas " +
                    "de la ciudad.","https://static.wikia.nocookie.net/vsbattles/images/6/6c/DDrender2.png/revision/latest?cb=20220601204358",1),
            Hero(8,"Moon knight","" +
                    "Marc Spector, un ex mercenario y agente de la CIA, sufre una experiencia cercana a la muerte durante una misión en Egipto, donde es resucitado por " +
                    "el dios lunar Khonshu. A partir de ese momento, se convierte en Moon Knight, el avatar terrenal del dios, protegiendo a los inocentes durante la noche. " +
                    "Marc lucha contra múltiples identidades, incluida la de un millonario llamado Steven Grant y un taxista llamado Jake Lockley, lo que complica su vida " +
                    "tanto como héroe como en lo personal. Armado con habilidades de combate y la bendición de Khonshu, lucha contra el crimen mientras busca el equilibrio " +
                    "entre su propia psique y su misión divina.","https://static.wikia.nocookie.net/vsbattles/images/0/0f/Loony_moony.png/revision/latest?cb=20220510165238",1),
            Hero(9,"Hulk","Bruce Banner, un brillante científico, se transforma en el increíble Hulk después de exponerse a una gran cantidad de radiación " +
                    "gamma durante un experimento que salió mal. Cuando se enfurece o experimenta estrés extremo, se convierte en una criatura gigantesca, increíblemente " +
                    "fuerte y prácticamente invulnerable, conocida como Hulk. Aunque Bruce intenta controlar su ira para evitar transformarse, el Hulk es una fuerza incontrolable " +
                    "y destructiva. A lo largo de su vida, Bruce lucha por encontrar un equilibrio entre su intelecto y la monstruosa fuerza del Hulk, mientras enfrenta " +
                    "tanto a enemigos que buscan aprovechar su poder como a su propio tormento interno.","https://i.pinimg.com/originals/9d/28/ed/9d28ed4f08d480d51708e1213b8a94a2.png",1),
            Hero(10,"Loki","Loki, el Dios de las Mentiras y el Engaño, es el hijo adoptivo de Odín, rey de Asgard, y hermano de Thor. Nacido como un gigante de hielo, fue criado en " +
                    "Asgard, siempre a la sombra de su poderoso hermano. Con su habilidad para cambiar de forma, manipular la magia y crear ilusiones, Loki constantemente trama planes para tomar el trono y " +
                    "causar caos, motivado por su envidia y deseo de poder. A pesar de su naturaleza traicionera, Loki es un personaje complejo, que en ocasiones lucha entre su ansia de caos y un anhelo " +
                    "más profundo de reconocimiento y pertenencia.","https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/b3acc143-332f-43c9-8707-d61106b45a55/dehc4sb-9e2e0504-9f7d-4e8d-80f6-" +
                    "8cf4e6ac4f3f.png/v1/fill/w_756,h_1057/loki___marvel_comics__by_rayluishdx2_dehc4sb-pre.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZD" +
                    "QxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NDA5NiIsInBhdGgiOiJcL2ZcL2IzYWNjMTQzLTMzMmYtNDNjOS04NzA3LWQ2MTEwNmI0NWE1N" +
                    "VwvZGVoYzRzYi05ZTJlMDUwNC05ZjdkLTRlOGQtODBmNi04Y2Y0ZTZhYzRmM2YucG5nIiwid2lkdGgiOiI8PTI5MjgifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.5ek0ei7ukveOsv_wDMy-j2bPFQf67AFDnDAu9-yu-qI",1),
            Hero(11,"Superman","Kal-El, conocido en la Tierra como Clark Kent, es el último sobreviviente del planeta Krypton, enviado a nuestro mundo de bebé antes de la destrucción de su hogar. Criado por " +
                    "una familia de granjeros en Smallville, Clark descubre que bajo el sol amarillo de la Tierra posee poderes sobrehumanos, como fuerza, velocidad, invulnerabilidad y la capacidad de volar. Con el nombre de " +
                    "Superman, se convierte en el protector de la humanidad, luchando por la verdad, la justicia y el bienestar de todos. A pesar de su inmenso poder, su mayor lucha es equilibrar su identidad como héroe y su" +
                    " deseo de vivir una vida normal como Clark Kent.","https://i.pinimg.com/originals/a6/6a/0b/a66a0b24603210def5fff4c759f18c58.png",2),
            Hero(12,"Batman","Bruce Wayne, un multimillonario de Gotham City, jura vengar la muerte de sus padres, quienes fueron asesinados frente a él cuando era niño. Sin poderes sobrehumanos, " +
                    "Bruce se entrena hasta el límite de la perfección física y mental, convirtiéndose en el vigilante conocido como Batman. Utiliza su intelecto, habilidades de combate y tecnología avanzada para combatir el " +
                    "crimen y la corrupción en Gotham, enfrentándose a una galería de villanos icónicos. Aunque lucha en la oscuridad y usa el miedo como arma, sigue un estricto código moral que lo distingue de los criminales a " +
                    "los que enfrenta, manteniéndose como el Caballero de la Noche.","https://www.pngplay.com/wp-content/uploads/13/Batman-Comic-Book-Outfit-Transparent-Images.png",2),
            Hero(13,"Aquaman","Arthur Curry, conocido como Aquaman, es el hijo de un farero humano y Atlanna, la reina de la mítica Atlántida. Heredando habilidades sobrehumanas de su linaje atlante, como la " +
                    "capacidad de respirar bajo el agua, fuerza sobrehumana y la comunicación telepática con la vida marina, Arthur se convierte en el rey de los océanos. Como Aquaman, lucha por proteger tanto a los habitantes de " +
                    "la superficie como a su reino submarino de amenazas que intentan desatar el caos en ambos mundos. Dividido entre dos mundos, su misión es mantener la paz mientras lucha por aceptar su destino como líder y héroe.","" +
                    "https://static.wikia.nocookie.net/deathbattle/images/8/8b/Portrait.thedeep.png/revision/latest?cb=20240721013037",2),
            Hero(14,"Mujer maravilla","Diana Prince, conocida como la Mujer Maravilla, es una amazona de la isla mítica de Themyscira. Criada entre guerreras inmortales, Diana posee una fuerza sobrehumana, agilidad, y " +
                    "habilidades de combate excepcionales, junto con un sentido innato de justicia. Al dejar su hogar para el mundo de los humanos, se convierte en una campeona de la paz y la igualdad, utilizando sus poderes, su lazo de la " +
                    "verdad y su indestructible brazalete para luchar contra el mal. Diana busca promover la paz y el entendimiento, mientras enfrenta desafíos tanto en el mundo moderno como en su lucha contra las fuerzas de la guerra y el caos.","" +
                    "https://i.pinimg.com/originals/f0/1f/b7/f01fb7fe2dd4ca852dbc394d628efcd3.png",2),
            Hero(15,"Linterna verde","Hal Jordan, un piloto de pruebas de la Fuerza Aérea de los Estados Unidos, es reclutado por los Guardianes del Universo para unirse a los Green Lantern Corps, una fuerza policial intergaláctica. " +
                    "Dotado de un anillo de poder que le concede habilidades extraordinarias y le permite manifestar cualquier cosa que pueda imaginar, Hal se convierte en el Linterna Verde de Sector 2814. Utiliza su anillo para proteger el universo de amenazas " +
                    "y garantizar la justicia, luchando contra villanos y manteniendo el equilibrio en el cosmos. A pesar de su valentía y dedicación, Hal enfrenta desafíos tanto en su vida personal como en su deber como protector del universo.","" +
                    "https://i.pinimg.com/originals/c7/f5/cd/c7f5cd84aac5d1564c2ef9a8c3575127.png",2),
            Hero(16,"Blue beatle","Jaime Reyes, conocido como Blue Beetle, es un adolescente que descubre un escarabajo alienígena mientras explora un vertedero. El escarabajo se adhiere a su columna vertebral y le otorga un traje de poder " +
                    "que le proporciona una variedad de habilidades, como super fuerza, vuelo, y la capacidad de generar armas y escudos de energía. Al convertirse en Blue Beetle, Jaime enfrenta desafíos tanto en su vida personal como en su papel como héroe, " +
                    "tratando de equilibrar su vida escolar con su nueva responsabilidad de proteger el mundo. Su relación con el escarabajo, que tiene una conciencia propia, añade una dimensión única a sus aventuras.","https://images-wixmp-ed30a86b8c" +
                    "4ca887773594c2.wixmp.com/f/b3acc143-332f-43c9-8707-d61106b45a55/deinlt7-e6d947fb-defe-403d-9cae-f80a4ee81d9e.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXN" +
                    "zIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2IzYWNjMTQzLTMzMmYtNDNjOS04NzA3LWQ2MTEwNmI0NWE1NVwvZGVpbmx0Ny1lNmQ5NDdmYi1kZWZlLTQwM2QtOWNhZS1mODBhNGVlODFkOWUucG5nIn1dXSwiYXVkIjpbInVyb" +
                    "jpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.SmrWRlWUCX_hpqlsGXuJWEGuUBz2wZq39ztOwAy_9Q8",2),
            Hero(17,"Flash","Barry Allen, conocido como The Flash, es un forense de la policía de Central City que obtiene supervelocidad después de un accidente con productos químicos y un rayo. Con su nueva habilidad para moverse a velocid" +
                    "ades extremas, Barry se convierte en el héroe conocido como The Flash. Utiliza su velocidad para combatir el crimen, viajar a través del tiempo, y proteger su ciudad de una variedad de amenazas. A pesar de sus poderes, Barry enfrenta desafíos " +
                    "tanto personales como heroicos, luchando por mantener el equilibrio entre su vida cotidiana y su misión de salvar el mundo. Su conexión con la Fuerza de Velocidad, una entidad cósmica que le otorga sus poderes, también lo coloca en el centro de " +
                    "una serie de aventuras que exploran la naturaleza del tiempo y la realidad.","https://i.pinimg.com/originals/83/10/59/83105916580f7b38172a68bc0cd688bb.png",2),
            Hero(18,"Cyborg","Victor Stone, conocido como Cyborg, es un prodigio en ingeniería y deportes que sufre graves lesiones en un accidente que casi le cuesta la vida. Su padre, el Dr. Silas Stone, utiliza tecnología avanzada para salvarlo, " +
                    "convirtiendo a Victor en un cyborg con habilidades sobrehumanas. Equipado con una variedad de armas y tecnología integrada, así como la capacidad de hackear sistemas y manipular tecnología, Cyborg se une a los Teen Titans y, más tarde, a la Liga de la " +
                    "Justicia para luchar contra amenazas globales. A pesar de su impresionante arsenal de capacidades, Victor enfrenta desafíos personales al reconciliar su identidad humana con su nueva existencia como una mezcla de hombre y máquina.","https://s" +
                    "tatic.wikia.nocookie.net/characterprofile/images/c/cc/Cyborg_DC_Render.png/revision/latest?cb=20231102194744",2),
            Hero(19,"Shazam","Billy Batson, un adolescente huérfano, recibe el poder de convertirse en el superhéroe Shazam al pronunciar la palabra mágica Shazam. Al hacerlo, Billy se transforma en un adulto con fuerza sobrehumana, veloci" +
                    "dad, y una variedad de habilidades mágicas, gracias a los dioses y figuras mitológicas que forman el acrónimo de su nombre: Salomón, Hércules, Atlas, Zeus, Aquiles, y Mercurio. Como Shazam, Billy combina la sabiduría de Salomón con la fuerza de" +
                    " Hércules, la resistencia de Atlas, el poder de Zeus, la valentía de Aquiles, y la velocidad de Mercurio para combatir el mal. A pesar de su poder, sigue siendo un joven con la mente y emociones de un adolescente, lo que a menudo influye en su en" +
                    "foque de ser un héroe y enfrentar los desafíos de su vida y del mundo.","https://static.wikia.nocookie.net/vsbattles/images/c/cd/Debflwq-0bcec116-c4ca-4728-bb23-890ef2e3913b.png/revision/latest?cb=20231130041105",2),
            Hero(20,"Flecha verde","Oliver Queen, conocido como Green Arrow, es un multimillonario y filántropo de Star City que se convierte en un vigilante después de quedar varado en una isla desierta. Durante su tiempo en la isla, Oliver entrena en " +
                    "arquería y combate, y cuando regresa a la ciudad, usa sus habilidades para luchar contra el crimen bajo el alias de Green Arrow. Equipado con un arco y flechas especializadas, Oliver combate la corrupción y el crimen organizado, enfrentando una variedad de" +
                    " villanos mientras intenta equilibrar su vida como empresario y héroe. A pesar de su estilo de vida lujoso y su fortuna, Oliver está impulsado por un fuerte sentido de justicia y un compromiso con la protección de su ciudad.","https://static.wikia.nocoo" +
                    "kie.net/character-level/images/2/23/%28Post-Crisis%29_Green_Arrow.png/revision/latest?cb=20190320135433",2)
        )
    }
}
