package foodOrder

class PaypalPayment: Payment {
    override fun processPayment(price: Int): Boolean {
        println("paying $price using pay pal")
        return true
    }
}