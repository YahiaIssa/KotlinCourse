package org.kotlion.unlimted

fun main() {
    check(
        name = "when enter 1 return",
        result = calculateSingleNumberFizzBuzz(1),
        correctResult = "1"
    )

    check(
        name = "when enter 3 return Fizz",
        result = calculateSingleNumberFizzBuzz(3),
        correctResult = "fizz"
    )

    check(
        name = "when enter 5 return Buzz",
        result = calculateSingleNumberFizzBuzz(5),
        correctResult = "buzz"
    )

    check(
        name = "when enter 15",
        result = calculateSingleNumberFizzBuzz(15),
        correctResult = "fizzbuzz"
    )

    // لو بدك تطبع القائمة كاملة
    // println(fizzBuzz(20))
}

fun fizzBuzz(number: Int): List<String> {
    val result = mutableListOf<String>()
    for (i in 1..number) {
        result.add(calculateSingleNumberFizzBuzz(i))
    }
    return result
}

fun calculateSingleNumberFizzBuzz(number: Int): String {
    return ""
//    when {
//        number % 3 == 0 && number % 5 == 0 -> "fizzbuzz"
//        number % 3 == 0 -> "fizz"
//        number % 5 == 0 -> "buzz"
//        else -> number.toString()
//    }
}

fun check(name: String, result: String, correctResult: String) {
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name | expected: $correctResult, got: $result")
    }
}