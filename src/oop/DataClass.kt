package oop

fun main() {
    val dc1= DataClass("Ahmed",25)
    val dc2= DataClass("Mohammed",30)
    val dc3=DataClass()
    println(dc1.myInfo())
    println(dc2.myInfo())
    println(dc3)                 // print default parameters

    println("==================================")

    val p1 = DataClass("Ali",30)
    println(p1.component1())
    println(p1.component2())
}







//equals /hashcode / toString()
data class DataClass(val name:String="UnKnown" , val age:Int=0) {

    fun myInfo():String{
        return "my name is $name and iam $age Years Old"
    }

}