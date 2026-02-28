package org.kotlin.taxiapp.vehicles

import org.kotlion.unlimted.trip.BasicTrip
import org.kotlion.unlimted.trip.FoodDecorator
import org.kotlion.unlimted.trip.MusicDecorator
import org.kotlion.unlimted.trip.Trip
import org.kotlion.unlimted.trip.TripDecorator
import org.kotlion.unlimted.trip.WifiDecorator


fun main() {
    val input=1

    println("factorial ($input) = ${factorial(input)}")
}
fun factorial(input: Int): Long {
    return if (input==1) 1 else input * factorial(input-1)
}

