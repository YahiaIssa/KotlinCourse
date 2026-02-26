package org.kotlion.unlimted.payment.method.discount

abstract class Discount {
    abstract val percentage : Int

    fun getFactor(): Float{
        return (100f-percentage)/100f
    }
}