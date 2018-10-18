package basics

import kotlin.system.measureTimeMillis

fun main(args: Array<String>){
    val veryLongList = (1..999999L).toList()

    var sum = 0L
    var lazySum = 0L

    val msNonLazy = measureTimeMillis {
       sum =  veryLongList
                .filter { it > 50 }
                .map{ it * 2}
                .take(1000)
                .sum()
    }

    val msLazy = measureTimeMillis {
        lazySum =  veryLongList
                .asSequence()
                .filter { it > 50 }
                .map{ it * 2}
                .take(1000)
                .sum()

    }

    println("Non-lazy: $msNonLazy ms, Result: $sum")
    println("Non-lazy: $msLazy ms, Result: $lazySum")

    //val seq = generateSequence (1, {it + 1 })
    //println(seq.take(10).toList())
}