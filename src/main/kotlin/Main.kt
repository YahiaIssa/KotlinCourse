package org.example

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@OptIn(DelicateCoroutinesApi::class)//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val hotFlow: MutableStateFlow<Int> = MutableStateFlow(5)
    GlobalScope.launch {
        hotFlow.filter {
            it % 2 == 0
        }.collect {
            println(" new value emitted: $it")
        }
    }

    runBlocking {
        hotFlow.emit(3)
        delay(2000)
        hotFlow.emit(6)
        delay(2000)
        hotFlow.emit(8)
        delay(100)
        hotFlow.emit(12)
        delay(2000)
        hotFlow.emit(17)
        delay(100)
        hotFlow.emit(20)
        delay(5000)
        hotFlow.emit(23)
        delay(1000)
        hotFlow.emit(28)
        delay(100000)

    }



//    val x= flow <Int>{
//        emit(10)
//        delay(2000)
//        emit(20)
//        delay(2000)
//        emit(30)
//    }
//    runBlocking {
//        x.collect {
//            println(it)
//
//        }
//    }

}
