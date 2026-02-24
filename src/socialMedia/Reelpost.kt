package socialMedia

class Reelpost(
    publisherName: String,
    content: String,
    hdVideoUrl: String,
    fullHdVideoUrl: String,
    allowComment: Boolean = true
) : videoPost(
    publisherName,
    content,
    hdVideoUrl,
    fullHdVideoUrl,
    allowComment
) {
    fun swipeToNext(): Reelpost {
        //TODO:wrtie th logic here

    }

    override fun uploadVideo(url: String) {
        if (/* */) {
            super.uploadVideo(url)
        } else {
            println("error video more than 30 seconds")
        }

    }
}