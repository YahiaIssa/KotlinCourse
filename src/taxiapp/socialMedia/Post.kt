package socialMedia

 class Post(
    val publisherName: String,
    val content: String,
    private val allowComment: Boolean = true,
    val mediaContent: MediaContent? = null,
) {
    var likesCount: Int = 0
        private set

    var comments: MutableSet<Comment> = mutableSetOf()
        private set


    fun like() = likesCount++

    fun removelike() = likesCount--

    fun addComment(newComment: Comment) {
        if (allowComment) {
            comments.add(newComment)
        }
    }
}