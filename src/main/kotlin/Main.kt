package org.example

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    startSearchListener()
    runBlocking {
        delay(2000)
        search("A")
        delay(100)
        search("Ap")
        delay(60)
        search("App")
        delay(120)
        search("Appl")
        delay(600)
        search("Apple")

        delay(10000)
    }

}
val searchFlow: MutableStateFlow<String> = MutableStateFlow(" ")
suspend fun search(keyword:String){
searchFlow.emit(keyword)
}
@OptIn(DelicateCoroutinesApi::class, FlowPreview::class)
fun startSearchListener(){
    GlobalScope.launch {
        searchFlow.filter (String::isNotBlank)
            .debounce(500)
            .collect (::query)
        } }


fun query(input: String){
    println("searching about : $input")
}
