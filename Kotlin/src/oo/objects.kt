package oo

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import oo.House.Companion.getNormalHouse as createHouse
//like singleton JAVA
object CountryFactory{
    val a = 4
    fun createCountry() = Country("Australia")
}

object DefaultClickListner : MouseAdapter(){
    override fun mouseClicked(e: MouseEvent?) {
        println("Mouse was clicked")
    }
}

fun main(args: Array<String>) {
    CountryFactory.a
    val obj = CountryFactory.createCountry()
    createHouse()
}

