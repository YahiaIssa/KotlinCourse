package org.kotlion.unlimted.payment.method.calculator

class CostCalculator {
    fun c(distance: Int): Int {
        val initialCost = 2000
        val costPerKm = 1500
        return initialCost + (distance * costPerKm)
    }
}