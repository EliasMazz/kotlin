package basics

fun main(args: Array<String>){
    val list = (1..1000).toList()

    val first10 = list.take(10).toList()
    val withoutFirst900 = list.drop(900)

    val list2 = generateSequence(0) {it+10}


}