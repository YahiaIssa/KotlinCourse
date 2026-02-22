package org.kotlion.unlimted

fun main() {
    val sumResult = sum(2, 8,2,2)
    println("\nsumResult=$sumResult")
    val largestNumber = findLargestNumber(
        3,
        number=  listOf(20, 17, 50, 24, 8, 12) )
    println("\nlargestNumber from the entered numbers is : $largestNumber")
}

fun sum(firstNumber: Int, secondeNumber: Int,thirdNumber: Int=0,forthNumber:Int=0) = firstNumber + secondeNumber+ thirdNumber+forthNumber

fun sam(vararg numbers: Int) : Int{
    var sum = 0
    numbers.forEach {
        currentNumber ->
        sum += currentNumber
    }
    return sum
}


fun findLargestNumber( startIndex: Int = 0 ,number: List<Int>): Int {
    var largestNumber = Int.MIN_VALUE
    for (i in startIndex until number.size) {
        if (number[i] > largestNumber) {
            largestNumber = number[i]
        }
    }
    return largestNumber
}



