package socialMedia

import socialMedia.Post

open class videoPost(
    publisherName: String,
    content: String,
    val hdVideoUrl: String,
   val fullHdVideoUrl: String,
     allowComment: Boolean = true
) : Post(publisherName,content,allowComment) {
    open fun uploadVideo(url: String) {
        println("start Uploading video")
    }
}