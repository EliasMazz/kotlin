package basics

fun main(args: Array<String>){
    val list = listOf("hi","there","kotlin","fans")
    val containsT= listOf(false,true,true,false)

    val zipped: List<Pair<String,Boolean>> = list.zip(containsT)
    val mapping = list.zip(list.map{it.contains("t")})

    println(zipped)
    println(mapping)
}
