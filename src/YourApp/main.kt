package YourApp

fun main() {
    println("Enter your Name :")
    val name= readln()                                  //string by default
    println("Your Name Is $name")

println("=====================================")
    println("Enter your Number :")
    val number= readln()?.toInt()
    println("Your Number Is $number")
    println(number?.javaClass?.name)

println("=====================================")
    println("Enter the first number :")
    val number1= readln()!!.toInt()
    println("Enter the second number :")
    val number2= readln()!!.toInt()
    val result=number1+ number2

    println("The sun is $result")
    println(number?.javaClass?.name)
}