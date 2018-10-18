package oo

abstract class ShapeV2(val name: String){
    abstract fun area(): Double
    open fun test() = 2

}

class CircleV2(name: String, val radius: Double) : ShapeV2(name) {
    override fun area(): Double {
      return  Math.PI *  Math.pow(radius, 2.0)
    }
}

fun main(args: Array<String>){
    val shape = CircleV2 ("name", 17.0)
    println(shape.area())
    println(shape.test())
}