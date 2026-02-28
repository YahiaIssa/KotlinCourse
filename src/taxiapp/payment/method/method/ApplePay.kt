package taxiapp.payment.method.method

class ApplePay() : PaymentStrategy {
    override fun pay(amount: Int) {
        println("Paying $amount with ApplePay Payment")
    }
}