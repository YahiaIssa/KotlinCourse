package org.kotlion.unlimted

import foodOrder.meal

class Cart {
    private var mealisinCart: MutableList <meal> =mutableListOf()
    fun addItem(meal: meal)
    {
        mealisinCart.add(meal)
    }
    fun clearItems(){
        mealisinCart.clear()
    }
    fun getallItems():List<meal>{
        return mealisinCart

    }
}