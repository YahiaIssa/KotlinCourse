package org.kotlion.unlimted
import  java.util.UUID
class BankAccount(
    val fullname: String) {

    val accountId: UUID = UUID.randomUUID()
    private var balance = 0

    fun deposit(amount: Int) {
        balance += amount
    }
    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        }else {
            return false
        }
    }
    fun getBalance(): Int {
        return balance
    }
}