package org.kotlion.unlimted

fun main() {
    check(
        name = "when given a valid simple parentheses string return true",
        result = isValidParenthese("()"),
        correctResult = true
    )

    check(
        name = "when given a valid nested parentheses string return true",
        result = isValidParenthese("(())"),
        correctResult = true
    )

    check(
        name = "when given a valid complex parentheses string return true",
        result = isValidParenthese("(()())"),
        correctResult = true
    )

    check(
        name = "when given unmatched closing parentheses return false",
        result = isValidParenthese("())"),
        correctResult = false
    )

    check(
        name = "when given unmatched opening parentheses return false",
        result = isValidParenthese("(()"),
        correctResult = false
    )
}

fun isValidParenthese(input: String): Boolean {
    var balance = 0
    for (ch in input) {
        when (ch) {
            '(' -> balance++
            ')' -> {
                balance--
                if (balance < 0) return false
            }
            else -> return false
        }
    }
    return balance == 0
}

fun check(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name | expected: $correctResult, got: $result")
    }
}