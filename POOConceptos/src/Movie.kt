class Movie(nombrePelicula: String, duracionPelicula: Int, estatus: Boolean = true
        ): Media(nombrePelicula, duracionPelicula, estatus) {

    var ganoOscar = false

    override fun toString(): String {
        return "$nombrePelicula duracion: $duracionPelicula horas"
    }

    override fun play(): Boolean {
        return super.play()
    }
}
