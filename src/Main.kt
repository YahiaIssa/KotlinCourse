package org.kotlion.unlimted


fun main() {


   val result= calculatcirclearea(5.2)
    println("CArea $result cm")

    calculetSequarearea(10.0)
    calculetTringle(10.5,5.6)
}
var factor = 60
fun calculatcirclearea(redius: Double): Double {
    val pi: Double = 3.14
    return redius * redius * pi
}
fun calculetSequarearea( Side : Double ) {

    val SArea = Side * Side
    println("SArea : $SArea cm2")
}
fun  calculetTringle(base : Double ,height : Double)
{
val Tarea=0.5*base*height
    println("Tarea : $Tarea cm")
}
