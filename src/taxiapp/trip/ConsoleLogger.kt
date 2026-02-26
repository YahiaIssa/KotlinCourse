package taxiapp.trip

import java.util.Date

object ConsoleLogger: Logger {
    override fun log(message: String) {
        println("SYSTEM LOG ${Date()} | $message")
    }

}