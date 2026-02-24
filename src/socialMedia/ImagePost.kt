package socialMedia

import socialMedia.Post

class ImagePost (
    publisherName: String,
    content: String,
    allowComments: Boolean=true,
   val ImageUrl: String,
): Post(
    publisherName,
    content,
    allowComments
){
    val imgeUrl: String="$ImageUrl"
}