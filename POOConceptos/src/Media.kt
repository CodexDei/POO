open class Media (protected var nombrePelicula: String, var duracionPelicula: Int,
                  var estatus: Boolean = true) {

    companion object{

        private const val FRAME_RATE_SD = 60
        private const val FRAME_RATE_HD = 120
        private const val SECOND_IN_MINUTE = 60

        fun getTotalFrames(duration: Int, isHD: Boolean): Int {

            return if(isHD){
                FRAME_RATE_HD * SECOND_IN_MINUTE * duration
            } else{
                FRAME_RATE_SD * SECOND_IN_MINUTE * duration
            }
        }
    }

    open fun play(): Boolean{

        return if (estatus){

            if (duracionPelicula > 0){

                for (i in 0 until duracionPelicula){
                    println("Pelicula $nombrePelicula en reproduccion")
                    duracionPelicula -= 1
                    if (duracionPelicula == 0){
                        println("Pelicula $nombrePelicula finalizada")
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

    fun paused(){

        println("Movie paused")
    }


}