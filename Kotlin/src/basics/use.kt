package basics

import java.io.FileReader

fun main(args: Array<String>){
    //IO and DATABSE operations
    FileReader("mayexist.txt").use{
        val str = it.readText()
        println(str)
    }

}