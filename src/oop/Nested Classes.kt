package oop

fun main() {
    //val obj1=Nested()              // call main class
    val obj2=Nested.Nested2()       // call second class
    obj2.info()

}


class Nested{

    class Nested2 {
        var name:String="this is nested class number 2"
        fun info(){
            println(name)
        }
    }

}