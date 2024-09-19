package inheritance

//Sub Class
open class B : A(){

    var job : String=""

    fun printJob():String{
        return "$job"
    }
}

