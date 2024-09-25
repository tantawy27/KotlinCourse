package loop

fun main() {

    val values= listOf("Kotlin","Java","C++")
    for (it in values){
        println(it)
    }

    println("===================================")

    values.forEach{ println(it)}
}