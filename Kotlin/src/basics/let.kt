package basics

import java.io.File

fun main(args:Array<String>){
    //let()
    File("example.txt").bufferedReader().let {
        if(it.ready()){
            println(it.readLine())
        }
    }


    //working with nullables
    val str: String? = "Kotlin for android"

    str?.let {
        if(str.isNotEmpty()){
            str.toLowerCase()
        }
    }

}
