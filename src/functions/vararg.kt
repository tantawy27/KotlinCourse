package functions

//variable number of arguments  "vararg"

fun main() {

    printBookInfo("hello Kotlin","ahmed","ali","mohammed")

}



fun printBookInfo(title:String,vararg authors:String){     //vararg -> Array of list
    println(" $title - authors: ")
    authors.forEach { println(it) }
}

