package inheritance

fun main () {

    val obj1= B()
    println(obj1.printJobInfo())         // for "this" keyword
    obj1.name="tamer"
    obj1.age=25
    obj1.job="Dev"

    println(obj1.printInfo())
    println(obj1.printJob())
    println(obj1.printAllInfo())        // for "Super" keyword
    println("=================")
val obj2=C()
    obj2.email="ahmed@gmail.com"
    obj2.name="ahmed"
    obj2.age=30
    obj2.job="eng"
    println(obj2.printEmail())
    println(obj2.printInfo())
    println(obj2.printJob())
}