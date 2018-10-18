package basics

fun main(args: Array<String>){
    val timesTwp ={ x : Int -> x *2 }

    val add = { x:Int, y:Int-> x+y}

    val list = (1..100).toList()
    println(list.filter { element -> element % 2 == 0 })

    println(list.filter { it % 2 == 0 })

    println(list.filter { it.event() })

    println(list.filter { it.event() })

    println(list.filter ( ::isEven ))
}

fun Int.event() = this %2 == 0

fun isEven(i: Int) = i % 2 == 0