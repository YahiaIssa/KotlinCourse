package org.kotlion.unlimted

data class User (
    val username: String,
    val email: String,
):Comparable<User>{
    override fun compareTo(other: User): Int {
       return if (this.username == other.username) {
           0
       }else if (this.username>=other.username){
           1
       }else {
           -1
       }
    }
}

