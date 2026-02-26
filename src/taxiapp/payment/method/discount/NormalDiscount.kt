package org.kotlion.unlimted.payment.method.discount

class NormalDiscount: Discount() {
    override val percentage: Int
    get() = 10
}