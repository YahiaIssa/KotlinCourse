data class User(val username: String) {
    private var age: Int = 0

    fun setAge(newage: Int) {
        if (newage >= MUNIMUM_ALLOWED_AGE) {
            age = newage
        } else {
            throw Exception("age not allowed,minimum age is $MUNIMUM_ALLOWED_AGE")
        }
    }

    override fun toString(): String {
        return "(user name =$username ,age =$age)"
    }

    companion object {
        const val MUNIMUM_ALLOWED_AGE = 12
    }
}