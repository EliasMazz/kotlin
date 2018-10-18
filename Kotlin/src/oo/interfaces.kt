package oo

interface Drivable{
    val a: Int
    fun drive()

}

class Bicycle : Drivable{
    override val a: Int
        get() = 42

    override fun drive() {
        println("driving bicycle")
    }
}

class Boat : Drivable{
    override val a: Int
        get() = 53
    override fun drive() {
        println("driving boat")
    }
}

fun main(args: Array<String>){
    val drivable: Drivable = Bicycle()
    drivable.drive()

    val boat = Boat()
    boat.drive()

}