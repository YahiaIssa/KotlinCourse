package org.kotlion.unlimted


fun main() {
    val engineerAverageSalary: MutableList<Int> = mutableListOf(2000, 7000, 1000)
    println(engineerAverageSalary.addAll(1, listOf(1222)))
    println(engineerAverageSalary)
    println(engineerAverageSalary.removeAt(1))
    println(engineerAverageSalary.size)
    println(engineerAverageSalary.set(1,55))
    println(engineerAverageSalary)
//    println(engineerAverageSalary[1])
//    println(engineerAverageSalary.indexOf(2000))
//    println(engineerAverageSalary.isEmpty())
//    println(engineerAverageSalary.first ())
//    println(engineerAverageSalary.last())
//    println(engineerAverageSalary.reversed())
//    println(engineerAverageSalary.firstOrNull())


}


