package downloader

class TorrentDownloader(private val Torrentfile: String): Downloader {
    override fun download() {
        println("Starting download from torrent $Torrentfile")
    }
}