package oo

abstract class Vehicle (open val brand: String = ""){
    open fun drive(){
        println("Driving")
    }

    abstract fun honk()
}

class Sedan(override var brand: String="BRAND"):Vehicle(),Drivable{
    override fun honk() {
       println("Moop")
    }

     override fun drive() {
        super.drive()
    }

    override val a: Int
        get() = 33
}

fun main (args:Array<String>){
    val sedan = Sedan()
    sedan.drive()
    sedan.honk()
}