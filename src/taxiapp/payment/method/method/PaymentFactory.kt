package taxiapp.payment.method.method

class PaymentFactory {
    fun create(type: String): PaymentStrategy {
       return when (type) {
            "apple" -> ApplePay()
            "credit" -> CreditCardPayment()
            "paypal" -> PaypalPayment()
        else -> throw Exception("Invalid Payment Type")
        }
    }

}