package taxiapp.driver

class NormalDriver :Driver {
    override fun driver(writtenAddress: String) {
        println("Driver written: $writtenAddress")
    }
}