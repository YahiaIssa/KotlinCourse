package org.kotlion.unlimted

import socialMedia.Post
import javax.print.attribute.standard.JobStateReason


fun main() {
    val homeScreenstate: Screenstate= Loding()

when(homeScreenstate){
    is Error -> {homeScreenstate.reason}
    is Loding -> { TODO() }
    is Success -> { homeScreenstate.post }
}

}
sealed class Screenstate
class Success(val post: List<Post>): Screenstate()
class Loding(): Screenstate()
class Error(val reason: String): Screenstate()

//val day: WeekDays=WeekDays.FRIDAY
//    println(day.daynameinArabic)
//    when(day) {
//        WeekDays.SATURDAY -> TODO()
//        WeekDays.SUNDAY -> TODO()
//        WeekDays.MONDAY -> TODO()
//        WeekDays.TUESDAY -> TODO()
//        WeekDays.WEDNESDAY -> TODO()
//        WeekDays.THURSDAY -> TODO()
//        WeekDays.FRIDAY -> TODO()
//    }
//    }
//enum class WeekDays(val daynameinArabic : String) {
//    SATURDAY("السبت"),
//    SUNDAY("الاحد"),
//    MONDAY("الاثنين"),
//    TUESDAY("الثلاثاء"),
//    WEDNESDAY("الاربعاء"),
//    THURSDAY("الخميس"),
//    FRIDAY("الجمعة"),
//


