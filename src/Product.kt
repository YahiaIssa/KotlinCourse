 data class Product (
    val name: String,
 var price: Double=0.0,
 var category: String=""
 ){
     var discount: Double=0.0
     fun calculateFinalPrice(): Double {
    return price-(discount/100*price)

     }
 }

