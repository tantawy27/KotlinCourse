package functions

fun main() {
    printHi()
    val age = 25

    /*
    fun doWork(){
    if (age < 18) {
        println("your age less than 18")
    }
    else {
        println("okey")
    }

    }

    doWork()
    */

    fun doWork()=if(age<18) println("your age less than 18") else println("okey")
    doWork()
}

/*
fun printHi() {
    println("Hi")
}

*/

fun printHi() = println("Hi")






