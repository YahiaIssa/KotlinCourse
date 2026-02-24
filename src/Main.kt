package org.kotlion.unlimted

import socialMedia.Reelpost
import socialMedia.videoPost

fun main() {
    val Reelpost: Reelpost = Reelpost(
        publisherName = "ahmad",
        content = "it was a nice weekend with my friends",
        hdVideoUrl = "http://some.url",
        fullHdVideoUrl = "http://some.url"
    )
    Reelpost.swipeToNext()
    Reelpost.like()
    Reelpost.swipeToNext()
    println("post likes before: ${Reelpost.likesCount}")
    Reelpost.like()
    Reelpost.like()
    Reelpost.like()
    println("post likes after: ${Reelpost.likesCount}"
    )
}

