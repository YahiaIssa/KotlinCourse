package org.kotlin.unlimited

import User
import java.util.UUID

fun main() {

    val enteredUsername = "yahia"
    val enteredPassword = "@Password123"
//
//    try {
//        val id = login(enteredUsername, enteredPassword)
//        println("login successful, user id is: $id")
//    } catch (exception: InvalidUserNameException) {
//        println(exception.message) // show red sign on username text field
//    } catch (exception: InvalidUserPasswordException) {
//        println(exception.message) // show password format hint
//    } catch (exception: UserNotExistException) {
//        println(exception.message) // show snackbar tell user that user not found
//    }
}

val fakeUser = User(username = "yahia", password = "@Password123")

fun login(username: String, password: String): UUID {

    if (username.length < 3) {
        throw InvalidUserNameException("Please enter valid username")
    } else if (password.length < 8) {
        throw InvalidUserPasswordException("Password should be 8 characters at least")
    } else if (username != fakeUser.username || password != fakeUser.password) {
        throw UserNotExistException("username or password is invalid")
    }
modrinLogin(username, password).getOrNull()?.let { println(it)}
    return fakeUser.id
}
fun modrinLogin(username: String, password: String): Result<UUID> {
    return if (username.length < 3){
        Result.failure(InvalidUserNameException("Please enter valid username")
        )
    }
    else if (password.length<8){
        Result.failure(InvalidUserPasswordException(" password should be 8 characters at least"))
    }
    else if (username!=fakeUser.username|| password!=fakeUser.password){
        Result.failure(UserNotExistException("username or password is invalid"))
    }else
        Result.success(fakeUser.id)
}