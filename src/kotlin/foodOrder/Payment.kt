package foodOrder

interface Payment {
        fun processPayment(price: Int): Boolean
}