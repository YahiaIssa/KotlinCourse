package org.kotlion.unlimted

fun main() {
println(FizzBuzz(20))
}
fun FizzBuzz(number:Int): List<String> {
    val result : MutableList<String> = mutableListOf()
    for (currentnumber in 1..number) {
       val solution= calcsingleFizzBuzz(currentnumber)
   result.add(solution)
    }
 return result
}
fun calcsingleFizzBuzz(number:Int): String {
   return when {
        number % 3 == 0 && number % 5 == 0 -> "Fizz"
       number %3 ==0-> "Fizz"
       number % 5 == 0 -> "Buzz"
       else -> number.toString()
    }


}



