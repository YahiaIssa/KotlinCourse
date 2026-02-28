package taxiapp.payment.method.method

class PaypalPayment: PaymentStrategy {

     override fun pay (amount: Int) {
        println("paying $amount using pay pal")

    }
}