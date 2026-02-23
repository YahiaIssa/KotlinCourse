package org.kotlion.unlimted

fun main() {
val myBankAccount = BankAccount(fullname = "yahia issa ramadan")
    myBankAccount.deposit(10000)
    val iswithdrawSuccess = myBankAccount.withdraw(5000)
    println("is withdraw success: $iswithdrawSuccess \n the blance after the proccess is : \n ${myBankAccount.getBalance()}")
    val iswithdrawSuccess2 = myBankAccount.withdraw(5000)
    println("is withdraw success: $iswithdrawSuccess \n the blance after the proccess is : \n ${myBankAccount.getBalance()}")
}

