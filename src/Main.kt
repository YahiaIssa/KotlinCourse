package org.kotlion.unlimted

import downloader.CloudDownloader
import downloader.Downloader
import downloader.TorrentDownloader
import downloader.URLdownloader

fun main() {

    val filesDownloader: List<Downloader> = listOf(
        URLdownloader(fileUrl = "http://localhost"),
        TorrentDownloader(Torrentfile = "http://localhost"),
        CloudDownloader(CloudPath = "/cloud/myfiles/http://localhost")
    )
    filesDownloader.forEach {
        file->file.download()

    }
}

