package other

class Student(val name: String,
              val email: String,
              val age: Int=0,
              val isAdmin: Boolean = false
              ){
    fun shareApost() {
        println("$name is share a post")
    }
}