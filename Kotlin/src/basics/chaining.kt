package basics

fun main(args : Array<String>){
    val inputRows = listOf(
            mapOf("input01.csv" to listOf(3,5,-9977,7,11,66)),
            mapOf("input02.csv" to listOf(1,3,4)),
            mapOf("input03.csv" to listOf()),
            mapOf("input04.csv" to listOf(9888,33,14,12,5,66))
    )

    val cleaned = inputRows.flatMap { it.values }.flatten().filter { it in 0..100 }.toIntArray()


    println(cleaned.joinToString())
}