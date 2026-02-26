package org.kotlion.unlimted.payment.method

class  CreditCardPayment : PaymentMethod {

    override fun processPayment(amount: Int): Boolean {
        println("Paying $amount Dinar using credit card")
        return true
    }
}