class CineBoxPlayer: DownLoader.InterDownLoaderListener {
    override fun onDownloadFinished(media: Media) {
        media.play()
    }

    init{

        val downLoader = DownLoader()
        //llamamos e implementamos la interfaz
        downLoader.creandoHiloDescarga(this)

    }


}