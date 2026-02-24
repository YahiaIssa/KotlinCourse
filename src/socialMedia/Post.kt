package socialMedia

import javax.xml.stream.events.Comment

open class Post(
    val publisherName: String,
    val content: String,
    private val allowComment: Boolean = true
) {
    var likesCount: Int = 0
        private set

    var comments: MutableSet<Comment> = mutableSetOf()
        private set
    public var firstVarible: Int = 0
    private var secondeVarible: Int = 0
    protected var thiredVaribles: Int = 0
    fun like() = likesCount++

    fun removelike() = likesCount--

    fun addComment(newComment: Comment) {
        if (allowComment) {
            comments.add(newComment)
        }
    }
}