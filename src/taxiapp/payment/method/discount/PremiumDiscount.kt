package org.kotlion.unlimted.payment.method.discount

class PremiumDiscount: Discount() {
    override val percentage: Int
    get() = 20
}