package org.kotlion.unlimted

import socialMedia.MediaContent
import socialMedia.Post


fun main() {
    val post: Post = Post(
        publisherName = "ahmad",
        content = "it was a nice weekend with my friends",
        mediaContent = MediaContent(
            hdVideoUrl = "http",
            fullHdVideoUrl = "http",
        )
    )
   post.like()
    println("post likes before: ${post.likesCount}")
    post.like()
    post.like()
    post.like()
    println("post likes after: ${post.likesCount}"
    )
}

