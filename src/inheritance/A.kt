package inheritance

//Super Class
open class A {
    var name:String=""
    var age:Int=0

    fun printInfo():String {
        return "$name $age"
    }
}