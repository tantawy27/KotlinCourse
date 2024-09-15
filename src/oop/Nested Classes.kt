package oop

fun main() {
    //val obj1=Nested()              // call main class
    val obj2=Nested.Nested2()       // call second class
    obj2.info()


    val obj3=Outer()
    obj3.sayHi="Hi !"
    val obj4=obj3.Nested3()
    obj4.info()


}


class Nested{

        class Nested2 {
        var name:String="this is nested class number 2"
        fun info(){
            println(name)
        }
    }

}

class Outer{
var sayHi:String=""

    inner class Nested3 {                         //"inner" keyword to access the Outer properties
        var name:String="$sayHi this is nested class number 3"
        fun info(){
            println(name)
        }
    }

}