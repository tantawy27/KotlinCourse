package oop
import functions.fullName
import functions.initials
import functions.isAdult


fun main() {
    val name="Ahmed Tantawy"
    println(name.initials())

    val age=25
    println(age.isAdult())

    val person=Person("Ahmed Khaled",25)
    println("${person.name} its initials is : ${person.name.initials()}")
    println(person.fullName())
}

class Person (val name:String,val age:Int)



//fun String.initials():String{
//    val values=this.split(' ')
//    val firstInitial=values[0].substring(0,1)
//    val lastInitial=values[1].substring(0,1)
//    return "$firstInitial$lastInitial"
//}