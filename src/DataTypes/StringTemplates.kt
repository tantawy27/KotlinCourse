package DataTypes

fun main() {

    val message:String= """
        Hello,
        My name is Ahmed.
        How are you ?
    """.trimIndent()                      //delete whitespace
    println(message)


    println("================================")

    val message2:String= """
        Hello,
        My name is Mohammed.
        How are you ?
    """.replaceIndent("- ")
    println(message2)


    println("================================")

    val message3:String= """
        >> Hello,
        >> My name is Ali.
        >> How are you ?
    """.trimMargin(">>") //remove it
    println(message3)


    println("================================")
    val Name = "Tantawy"
    val Age = 25
    println("hello $Name your age is $Age")
    println("length of your name is ${Name.length} Characters")


}