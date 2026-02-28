package org.kotlion.unlimted.trip

import com.sun.beans.introspect.PropertyInfo


interface Trip {
    fun getDescription(): String
    fun getCost(): Int

}

class BasicTrip : Trip {
    private val description: String = "Simple taxi trip"
    private val cost: Int = 5000
    override fun getDescription(): String {
        return description
    }

    override fun getCost(): Int {
        return cost
    }
}

abstract class TripDecorator(private val trip: Trip) : Trip {
    override fun getCost(): Int {
        return trip.getCost()
    }

    override fun getDescription(): String {
        return trip.getDescription()
    }
}
    class WifiDecorator(private val trip: Trip) : TripDecorator(trip) {
        override fun getCost(): Int {
            return super.getCost() + 1000
        }

        override fun getDescription(): String {
            return super.getDescription() + ",with wifi"
        }
    }

    class ChiledSeatDecorator(trip: Trip) : TripDecorator(trip) {
        override fun getDescription(): String {
            return super.getDescription() + ",With chiled seat"
        }

        override fun getCost(): Int {
            return super.getCost() + 2000
        }
    }

    class MusicDecorator(trip: Trip) : TripDecorator(trip) {
        override fun getDescription(): String {
            return super.getDescription() + "With music"
        }

        override fun getCost(): Int {
            return super.getCost() + 1500
        }
    }
class FoodDecorator(trip: Trip) : TripDecorator(trip) {
    override fun getDescription(): String {
        return super.getDescription() + "With Food"
    }

    override fun getCost(): Int {
        return super.getCost() + 2000
    }
}
