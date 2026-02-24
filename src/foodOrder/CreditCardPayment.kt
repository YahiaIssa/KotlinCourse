package foodOrder

import foodOrder.Payment

class CreditCardPayment: Payment {
    override fun processPayment(price: Int) : Boolean{
        println("payment using creditcard")
        return true
    }
    fun calculateTotalTax(){


    }

}