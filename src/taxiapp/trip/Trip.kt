//package org.kotlion.unlimted.trip
//import org.kotlion.unlimted.payment.method.calculator.CostCalculator
//import org.kotlion.unlimted.payment.method.PaymentMethod
//import java.util.logging.Logger
//
//
//class Trip(
//    private val paymentMethod: PaymentMethod,
//    private val costCalculitar: CostCalculator,
//    private val logger: Logger
//) : logger by Logger {
//    private var distance: Int = 0
//    private var tripStatus: TripStatus = TripStatus.USER_ORERED_TAXI
//
//    fun advanceOneKM() {
//        if (tripStatus == TripStatus.TRIP_STARTED) {
//            distance++
//            println("Advanced 1 km")
//        } else {
//            println("Can't advanced while the Status is ${tripStatus} ")
//        }
//    }
//
//    fun startTrip() {
//        tripStatus = TripStatus.TRIP_STARTED
//        println("trip started")
//    }
//
//    fun endTrip() {
//        val tripCost: Int = costCalculitar.calculateTripCost(distance)
//        paymentMethod.processPayment(tripCost)
//        tripStatus = TripStatus.TRIP_ENDED
//        println("trip ended after $distance Km")
//
//    }
//    private fun calculateTripCost(): Int {
//        return CostCalculator.calculateTripCost(distance)
//
//    }
//
//    enum class TripStatus {
//        USER_ORERED_TAXI,
//        DRIVER_ACCEPT_TRIP,
//        TAXI_ARRIVED_START_POINT,
//        TRIP_STARTED,
//        TRIP_ENDED,
//        TRIP_CANCELED,
//
//    }
//}