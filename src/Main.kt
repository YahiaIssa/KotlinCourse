package org.kotlin.taxiapp.vehicles

import org.kotlion.unlimted.trip.BasicTrip
import org.kotlion.unlimted.trip.FoodDecorator
import org.kotlion.unlimted.trip.MusicDecorator
import org.kotlion.unlimted.trip.Trip
import org.kotlion.unlimted.trip.TripDecorator
import org.kotlion.unlimted.trip.WifiDecorator


fun main() {

    val trip: Trip = BasicTrip()
    val tripWithWifi = WifiDecorator(trip)
    val tripWithmusicAndWifi= MusicDecorator(tripWithWifi)
    val tripWithmusicAndWifiAndFood= FoodDecorator(tripWithmusicAndWifi)
 println("The trip is ${tripWithmusicAndWifiAndFood.getDescription()}Cost you ${tripWithmusicAndWifiAndFood.getCost()}")
}

