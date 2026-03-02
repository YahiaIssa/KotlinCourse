package org.kotlion.unlimted
import Product
import jdk.dynalink.Operation
import java.io.DataInput

fun main() {
    val number : List<Int> = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val smartPhone :Product=Product("Smartphone").apply {
        price=11.5
        category="Electronic"
    }
number.sorted()
    .also {println(it)}
    .filter (::isEven)
    .also{println{it}}

    with(smartPhone){

println(this.name)

"hello world"
    }
}
fun isEven(input: Int)= (input % 2).isZero()

fun Int.isZero() = this == 0