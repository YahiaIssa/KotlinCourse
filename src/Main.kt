package org.kotlion.unlimted

fun main() {
    //Float example
    val tempratiorToday: Float=35.3f
    run {
        val windSpeed = 15
        println("Wind speed: $windSpeed")
    }
    println(tempratiorToday)
    //null and null safety
    var x:Double? = 5.0
    var y=1.5
//    var result= x!!+y
    val result=x?.plus(y)
    println(result)
//String
    val helloMessage:String="Hello Kotlin World"
    println(helloMessage)
    val editedString=helloMessage.substring(4)
    println(editedString)
val editedString2=helloMessage.indexOf("kotlin")
    println(helloMessage.indexOf('k',0,true))
    println(helloMessage.length)
    println(helloMessage[3])
    println("result : $result ")
    println(helloMessage.uppercase())

}