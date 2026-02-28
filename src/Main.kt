package org.kotlin.taxiapp.vehicles

import taxiapp.locaitionTracker.HomeScreenObserver

import taxiapp.locaitionTracker.NotificationScreenObserver
import taxiapp.locaitionTracker.TripScreenObserver
import taxiapp.locaitionTracker.Observer


fun main() {

    val driverlocationObservable = Observable<String>()
    val homeScreenObserver : Observer<String> = HomeScreenObserver()
    val tripScreenObserver : Observer<String>  = TripScreenObserver()
    val notificationScreenObserver :Observer<String>= NotificationScreenObserver()
    driverlocationObservable.subscribe(homeScreenObserver)
    driverlocationObservable.subscribe(tripScreenObserver)
    driverlocationObservable.subscribe(notificationScreenObserver)
    driverlocationObservable.notifyObservars("60M Street")


}