package taxiapp.driver

class VIPDriver: Driver {
    override fun driver(writtenAddress: String) {
        println("ok sir , will Drive to $writtenAddress")
    }
}