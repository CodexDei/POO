class Series(nombrePelicula: String, duracion: Int, estatus: Boolean = true
            ): Media(nombrePelicula, duracion, estatus) {

    var totalEpisodios = 5
    var totalTemporadas = 3
    var duracionEpisodio = 0

init{

    duracionEpisodio = duracion

}

    override fun play(): Boolean {

        return if (estatus){

           var duracionReal = totalEpisodios * duracionEpisodio
            var duracionRealInicial = duracionReal

            if (duracionReal > 0){

                for (i in 0 until duracionReal){
                    println("Serie $nombrePelicula en reproduccion")
                    duracionReal -= 1
                    if (duracionReal == 0){
                        println("Serie $nombrePelicula finalizada")
                        println("Serie $nombrePelicula tuvo una duracion de $duracionRealInicial")

                        return false
                    }
                }
                true

            }else{

                println("Pelicula $nombrePelicula sin tiempo considerable")
                false
            }

        } else{

            println("Pelicula $nombrePelicula no esta disponible")
            false

        }
    }


}