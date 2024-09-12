package oop

class B {

    companion object {                      // make a default object with need to make a new one in main
        var firstName: String = "Ahmed"
        var lastName: String = "Tantawy"

        fun fullName(): String = "$firstName $lastName"            // function in Companion

        fun fullNameLength(): Int {
            return fullName().length

        }

    }
}

fun main()
{

    println(B.firstName)
    println(B.fullName())             // call method
    println(B.fullNameLength())

}