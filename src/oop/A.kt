package oop

class A (var firstName:String,var lastName:String) {

    fun fullName():String="$firstName $lastName"            // function in class

    fun fullNameLength():Int {
        return fullName().length
    }

}


fun main(){
    val user = A ("Ahmed","Tantawy")

    println(user.fullName())
    println(user.fullNameLength())


}