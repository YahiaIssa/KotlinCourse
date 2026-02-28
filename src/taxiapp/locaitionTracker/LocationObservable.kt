package taxiapp.locaitionTracker

class Observable<T> {
    private val subscribers: MutableList<Observer<T>> = mutableListOf()
    fun subscribe(observer: Observer<T>){
        subscribers.add(observer)
    }
    fun unsubscribe(observer: Observer<T>){
        subscribers.remove(observer)
    }
    fun notifyObservars(newLocaition: String){
        subscribers.forEach {it.onUpdate(newLocaition)

        }
    }
}