package org.kotlion.unlimted

fun main() {

    check(
        name = "when list has even number return correct index",
        result = getFirstEvenNumberIndex(listOf(1, 2, 3, 4, 5)),
        correctResult = 1
    )

    check(
        name = "when list has no even number return -1",
        result = getFirstEvenNumberIndex(listOf(1, 3, 5, 7)),
        correctResult = -1
    )

    check(
        name = "when list is empty return -1",
        result = getFirstEvenNumberIndex(emptyList()),
        correctResult = -1
    )

    check(
        name = "when first element is even return 0",
        result = getFirstEvenNumberIndex(listOf(1, 2, 5, 7)),
        correctResult = 0
    )
}

fun getFirstEvenNumberIndex(numbers: List<Int>): Int {
    for (i in numbers.indices) {
        if (numbers[i] % 2 == 0) {
            return i
        }
    }
    return -1
}

fun check(name: String, result: Int, correctResult: Int) {
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name | expected: $correctResult, got: $result")
    }
}