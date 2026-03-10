package org.example

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import kotlinx.coroutines.runBlocking



fun main() {
    runBlocking {

        getWaetherBylocation()
    }


}
suspend fun printGoogleContent(){
    val client= HttpClient(CIO)
   val response= client.get("https://www.google.com")
    println(response.bodyAsText())
}
suspend fun getWaetherBylocation(){
    val client= HttpClient(CIO)
    val response= client.get("")
    println(response.bodyAsText())
}
