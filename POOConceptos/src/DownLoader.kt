class DownLoader {

    interface InterDownLoaderListener {

        fun onDownloadFinished(media: Media)

    }

    fun creandoHiloDescarga(downLoaderListener : InterDownLoaderListener){

        val hiloDescarga = Thread(Runnable {

            println("***********************************************************************************")
            println("Empezando la descarga...")
            Thread.sleep(2000)
            println("Descargando...")
            Thread.sleep(2000)
            println("***********************************************************************************")
            println("Descargar Finalizada")

            var downloadedMovie = Movie("Matrix 4", 5)
             downLoaderListener.onDownloadFinished(downloadedMovie)
        })

        hiloDescarga.start()
    }
}