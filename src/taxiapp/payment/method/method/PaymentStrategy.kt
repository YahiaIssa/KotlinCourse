package taxiapp.payment.method.method

interface PaymentStrategy {
        fun pay(amount: Int)
}