package oo

//companion object is like static class in java

interface  HouseFactory{
    fun createHouse(): House
}

class House(val numberOfRooms: Int, val price: Double) {

    //NAME IS OPTIONAL
    companion object : HouseFactory{
        val HOUSES_FOR_SALE = 10
        fun getNormalHouse() = House(6, 199_999.0)
        fun getLuxuryHouse() = House(42, 7_000_000.0)
        override fun createHouse () = getNormalHouse()
    }


}

fun main(args: Array<String>){
    val normalHouse = House.getNormalHouse()
    println(normalHouse.price)

    println(House.HOUSES_FOR_SALE)
}