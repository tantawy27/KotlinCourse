package functions

fun main() {

    printBookInfo("hello Kotlin","ahmed","ali","mohammed")

}



fun printBookInfo(title:String,vararg authors:String){
    println(" $title - authors: ")
    authors.forEach { println(it) }
}

