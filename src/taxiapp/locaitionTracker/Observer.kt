package taxiapp.locaitionTracker

interface Observer<D> {
    fun onUpdate(newValue: String)
}

class HomeScreenObserver : Observer <String>{
    override fun onUpdate(newValue: String) {
        println("New location HomeScreenObserver Screen: $newValue")
    }
}

class TripScreenObserver : Observer <String> {
    override fun onUpdate(newValue: String) {
        println("New location TripScreenObserver Screen: $newValue")
    }
}

class NotificationScreenObserver : Observer <String> {
    override fun onUpdate(newValue: String) {
        println("New location NotificationScreenObserver Screen: $newValue")
    }
}

