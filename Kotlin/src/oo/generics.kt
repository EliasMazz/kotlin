package oo

import java.util.*

val list: List<Int> = listOf(1,2,3)

class Timeline<E> {

    val date2Date : MutableMap<Date,E> = mutableMapOf()

    fun add(element: E){
        date2Date.put(Date(),element)
    }

    fun getLatest(): E{
        return date2Date.values.last()
    }
}

fun <E> timelineOf(vararg elements: E): Timeline<E>
{
    val result = Timeline<E>()

    for (element in elements) {
        result.add(element)
    }

    return result
}

fun main(args: Array<String>) {
    val timeline: Timeline<Int> = Timeline()
    timeline.add(2)
    timeline.getLatest()

    val timeline2 = timelineOf(1,2,3)
}