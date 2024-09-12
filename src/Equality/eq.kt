package Equality

fun main() {
    //Structural equality
    // = =

    var name1="Mohammed"
    var name2="Mohammed"
    println(name1==name2)
    println("============================")
    println(name1.equals(name2))
    println("============================")
    println(name1!=name2)
    println("============================")

    // Referential Equality
    // = = =

    var obj1= person("mohammed")
    var obj2= person ("mohammed")

    println(obj1===obj2)  //not the same object
    println("============================")
    println(obj1!==obj2)
}

class person(var name:String)

