package oop

fun main() {
    val dc1= DataClass("Ahmed",25)
    val dc2= DataClass("Mohammed",30)

    println(dc1.myInfo())
    println(dc2.myInfo())
}







//equals /hashcode / toString()
data class DataClass(val name:String , val age:Int) {

    fun myInfo():String{
        return "my name is $name and iam $age Years Old"
    }

}