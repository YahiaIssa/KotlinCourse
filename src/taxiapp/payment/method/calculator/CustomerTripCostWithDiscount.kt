//package org.kotlion.unlimted.payment.method.calculator
//
//class CustomerTripCostWithDiscount(
//    private val distance: Int,
//    private val discountType: CostCalculator
//) : CostCalculator {
//    override fun calculateTripCost(distance: Int): Int {
//        return ((INITIAL_COST + calculateCostPerDistance(distance)).toFloat() * discountType.getFactor()).toInt()
//    }
//
//    private fun calculateCostPerDistance(distance: Int): Int {
//        return distance * COST_PER_KILO_METER
//    }
//
//    companion object {
//        private const val INITIAL_COST = 2000
//        private const val COST_PER_KILO_METER = 2000
//    }
//}