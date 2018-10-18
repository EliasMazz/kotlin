package basics

fun modifyString(str: String, opration:(String) -> String) : String{
    return opration(str)
}

fun main(args:Array<String>){
    modifyString("kotlin is amazin", { it.toUpperCase()})

}