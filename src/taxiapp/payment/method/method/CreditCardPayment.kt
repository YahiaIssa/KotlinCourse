package taxiapp.payment.method.method



class CreditCardPayment() : PaymentStrategy {

    override fun pay(amount: Int) {
        println("Paying $amount using Credit Card Payment")

    }
}