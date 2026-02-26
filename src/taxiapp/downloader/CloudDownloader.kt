package downloader

class CloudDownloader(private val CloudPath: String): Downloader {
    override fun download() {
        println("start download the file from cloud $CloudPath")
    }
}