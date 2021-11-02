package com.example.getterandsetter

import java.lang.IllegalArgumentException

fun main(){
  var mycar = Car()
    println("brand is : ${ mycar.myBrand}")
    mycar.maxSpeed = 200
    println(" Maxspeed is ${ mycar.maxSpeed}")
}
class Car(){
    lateinit var owner : String
    val myBrand : String= "BMW"
    get() {
        return field.toLowerCase()
    }
    var maxSpeed: Int = 250
    get() = field
    set(value) {
        field = if(value > 0) value else throw IllegalArgumentException( "Maxspeed cannot be less than 0")
    }
    init {
        this.owner = "frank"
    }


}








