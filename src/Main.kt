package org.kotlion.unlimted

fun main() {
    val someValue: Int=10
    val firstStudent : Student= Student("Yahia","yahia@kotlin.com",true)
    println(firstStudent.name )
    println("______________________________________________________")

    val scondeStudent : Student= Student("Hamzeh","Hamzeh@kotlin.com",false)
    println(scondeStudent.name )
    println("______________________________________________________")
    val therdStudent : Student= Student("Waleed","waleed@kotlin.com",false)
    println(therdStudent.name )
    println("______________________________________________________")
    val forthStudent : Student= Student("Hashiam","Hashiam@kotlin.com",true)
    println(forthStudent.name )
    println("______________________________________________________")
   println(firstStudent.email)
    firstStudent.email="yramadan@gmail.com"
    println("${firstStudent.name} chanege hes email to ${firstStudent.email}.email")
    println("______________________________________________________")
    firstStudent.shareApost()
    println("______________________________________________________")
    scondeStudent.shareApost()
    firstStudent.age=-25
    println(firstStudent.age)
}

