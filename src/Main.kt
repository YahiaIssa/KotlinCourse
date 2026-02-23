package org.kotlion.unlimted

fun main() {
println(getfirstEvenNumberIndex(listOf(1, 2, 3, 4, 5, 6, 7, 8)))
}
fun getfirstEvenNumberIndex(number: List<Int>): Int {
    number.forEachIndexed { index, number ->
        if (number %2 ==0)
        {return index}
    }
    return -1
}