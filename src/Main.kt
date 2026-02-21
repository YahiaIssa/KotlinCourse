package org.kotlion.unlimted



fun main() {
    //Casting data types
    val finalExamScore: String="4.7ghjgh"
    val result = finalExamScore + 1
    val y=(finalExamScore.toDoubleOrNull()?:0.0) + 1.0
    println(y)
    println(result)

}