package taxiapp.vehicles

class FleetManager<V: Vehicles> {
    private val vehicles = mutableListOf<V>()

    fun addVehicle(vehicle: V) {
        vehicles.add(vehicle)
        println("Vehicle added: $vehicle")
    }

    fun removeVehicle(vehicle: V) {
        if (vehicles.remove(vehicle)) {
            println("Vehicle removed: $vehicle")
        } else {
            println("Vehicle not found: $vehicle")
        }
    }

    fun listVehicles(): List<V> {
        return vehicles
    }
}