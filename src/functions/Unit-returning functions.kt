package functions

fun main() {
    var x = sayHello()
    println(x)

    var y = sayHello2()
    println(y)

    var z = sayHello3()
    println(z)

    sayHello4()

}
fun sayHello():String {
    return "hello world!"

}
fun sayHello2():Int {
    return 25
}
fun sayHello3():Boolean {
    return true
}

fun sayHello4(){
    println("if no data type it will be without return")
}


