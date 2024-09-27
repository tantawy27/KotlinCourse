package basics

fun main() {

    val age : Any =25
    val obj:Any=Person("Hany")
    if (obj is String){
        println("Yes,It's ! ")

    }else{
        println("No,It isn't ! ")
        println(obj.javaClass.name)
    }
}

data class Person(val name :String)
