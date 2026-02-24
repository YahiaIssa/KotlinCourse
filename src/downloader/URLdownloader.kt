package downloader


class URLdownloader(private val fileUrl: String): Downloader {
    override fun download() {
     println("Downloading file from url: $fileUrl")
    }

}