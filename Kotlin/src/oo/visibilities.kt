package oo

// private - same as in Java
// protected - same as in Java
// default public - same as in java
// internal - visible inside the same module level

// only visible inside this file
private val i = 42
fun a() = 17

open class Car(val brand: String, private val model: String){
    fun tellMeYoutModel() = model
}

class SpecificCar() : Car("",""){
    fun a (){
        tellMeYoutModel()
    }
}

fun main(args: Array<String>){
    val car = Car("BRAND", "MODEL")
    car.brand
    println(i)
}


