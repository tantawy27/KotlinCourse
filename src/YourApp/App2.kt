package YourApp

fun main() {
    println("Enter your name : ")
    val name = readLine()!!.toString()
    val value = name.split(' ')
    val firstchar=value[0].substring(0,1)
    val lastchar=value[1].substring(0,1)
    println("$firstchar$lastchar")

}