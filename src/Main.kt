package org.kotlion.unlimted

import socialMedia.Post
import javax.print.attribute.standard.JobStateReason


fun main() {
   val welcomeMassage: String="hello world"
  println(welcomeMassage.something)
    String.space
}
fun String.getWordsCount(): Int {
    return this.trim().split(String.space).size
}
 val String.something: Int
     get()=this.length/2
val String.Companion.space: String
get() = ""
