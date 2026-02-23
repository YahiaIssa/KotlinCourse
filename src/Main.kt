package org.kotlion.unlimted

fun main() {

}
fun isValidParentheses(input: String): Boolean {
    val stack = mutableListOf<Char>()
    for(char in input) {
        if(char == '(') {
            stack.add(')')
        }else if(char == ')') {
            stack.removeAt(stack.lastIndex)
        }
        if (stack.isEmpty()) {
            return false
        }
    }
    return stack.isEmpty()
}