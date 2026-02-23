package org.kotlion.unlimted

fun main() {
    val firstStudent: Student = Student("Yahia", "yahia@kotlin.com",22, true)
    val scondeStudent: Student = Student("Hamzeh", "Hamzeh@kotlin.com",23 ,false)
    val therdStudent: Student = Student("Waleed", "waleed@kotlin.com", 24,false)
    val forthStudent: Student = Student("Hashiam", "Hashiam@kotlin.com",25, false)


    firstStudent.shareApost()
    scondeStudent.shareApost()

}

