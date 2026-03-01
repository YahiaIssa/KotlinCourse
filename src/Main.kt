package org.kotlin.taxiapp.vehicles

import jdk.dynalink.Operation
import java.io.DataInput

fun main() {
    val todayTemperaterPerHours: List<Int> =
        listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val happyNumber: List<String> = listOf("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        ,"Ten ","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        ,"Ten")

    val foodCategory: List<Set<String>> = listOf(
        setOf("Apple", "Banana", "Orange", "Pear"),
        setOf("Carrot", "Broccli", "Spinach"),
        setOf("Chicken", "Beef", "Fish")
    )

    println(
        todayTemperaterPerHours.zip(happyNumber)
    )
//    println(
//        foodCategory.flatten()
//    )
//    println()
//    todayTemperaterPerHours.map (::finedDublicate )
//}
//fun finedDublicate(input: Int): Int{
//    return input*2
}

