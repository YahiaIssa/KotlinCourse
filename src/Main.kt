package org.kotlion.unlimted

fun main() {
    val engineeringAveragingSalari = listOf(8000, 5000, 6000, 7000)
    print("Salary : ")
    for (i in engineeringAveragingSalari ) {

        print(" [ $i ] ")
    }
    println("  ")
    for (i in 1..10) {
        for (j in 1..10) {
            if (i*j==35) {
                break
            }
            print("${i*j}\t ")
        }
        println("\n")

    }
//
//   while (engineeringAveragingSalari.isNotEmpty())
//   {
//        println(engineeringAveragingSalari)
//       engineeringAveragingSalari.removeAt(0)
//   }


//    while ( number>0 ){
//      number/=2
//        println("num :  $number")
//// }
//    var number:Int=5565
//    do {
//        println("number : $number")
//        number=2
//    }
//        while ( number>0 )
//}
    }

