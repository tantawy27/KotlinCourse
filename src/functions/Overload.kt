package functions


fun main() {
    printUserInfo("mohammed",24,"engineer")
}

fun printUserInfo(name:String) {
    println("my name is $name")
}


//overload it

fun printUserInfo(name:String, age:Int) {
    println("my name is $name,and my age is $age")
}

//overload it again
fun printUserInfo(name:String, age:Int,job:String) {
    println("my name is $name,and my age is $age,and my job is $job ")
}

