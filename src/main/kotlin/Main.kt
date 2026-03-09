package org.example

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
val searchScreenScope= CoroutineScope(Dispatchers.Default)
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    search("Freedom")
    runBlocking {
        delay(3000)
        search("kabab")
        delay(20000)
    }
}
    var searchJob: Job? = null
    fun search(term: String) {
        searchJob?.cancel()
        var searchJob=searchScreenScope.launch {

            for (i in 1.. 10){
                println("trying to search for $term iteration $i")
                delay(1000)
            }
        }
    }
fun screenClosed(){
    searchScreenScope.cancel()
}


//
//    val customScope = CoroutineScope(Dispatchers.Default)
//    customScope.launch {
//       var result=1
//        for (i in 1..10) {
//            result *=i
//            println("Result updated $result using thread ${Thread.currentThread().name}")
//            delay(1000)
//        }
//        withContext(Dispatchers.IO) {
//            println("Saving to storage ,using thread ${Thread.currentThread().name}")
//        }
//    }
//  customScope.launch {
//      waitFingerScan()
//  }
//    customScope.launch {
//        waitUserrIntraction()
//    }
//    runBlocking {
//        delay(20000)
//    }
//}
//suspend fun waitFingerScan(){
//    for (i in 1..8) {
//        println("waiting finger $i ${Thread.currentThread().name}")
//        delay(1000L)
//    }
//}
//suspend fun waitUserrIntraction(){
//    for (i in 1..8) {
//        println("waiting user interaction $i ${Thread.currentThread().name}")
//        delay(1000L)
//    }
