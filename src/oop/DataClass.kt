package oop

import javax.xml.crypto.Data

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

    println("==================================")

    //Destructure Data Class

    val (fname,fage,fjob)=DataClass()
    println(fname)
    println(fage)
    println(fjob)

    println("==================================")
    println("Copy() Fun")

    val obj=DataClass("Nour",21,"devoloper")     //object from class
    val mycopy = obj.copy(name = "Walaa",age=23,job="devoper") //copy from obj

    println(mycopy)

    val order=Order(amount=100,cst= mycopy)
    println(order)


    val order2=order.copy(amount=300)                   //copy from order
    println(order2)


}


data class Order(val amount:Int,val cst:DataClass)    //cst datatype is dataclass to enable it to make a copy







//equals /hashcode / toString()
data class DataClass(val name:String="UnKnown" , val age:Int=0,val job:String="None") {

    fun myInfo():String{
        return "my name is $name and iam $age Years Old"
    }

}