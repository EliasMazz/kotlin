package oo
// generates hashcode(), equals, tostring, copy, destructuring operator
data class Address(val street: String, val number: Int, val postCode:String, val city:String)

fun main (args: Array<String>){
    val residence = Address("Main street", 42,"1234", "New York")
    val residence2 = Address("Main street", 42,"1234", "New York")

    //toString()
    println(residence)

    //referencial equality
    println(residence===residence2)

    //Structural equality, equals
    println(residence==residence2)

    //copy

    val neighbor = residence.copy(number = 43)
    println(neighbor)

    //destructuring operator
    val (street,number,_,city) = residence

    println("$street $number, $city")

}