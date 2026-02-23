package org.kotlion.unlimted

class Student(val name: String, var email: String,  val isAdmin: Boolean) {
  private var canDelete:Boolean = true
    var age: Int=0
        get()=return field
        set(value){
            if (value > 0){
                field = value
            }else
              println("age is negative")
        }
    init {
        println(" an object from student type created with name $name ")
    }
    fun shareApost() {
        println("$name is share a post")
    }

}
