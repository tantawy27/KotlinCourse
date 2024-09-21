package inheritance

//Sub Class
open class B : A(){

    var job : String="unemployment"

    fun printJob():String{
        return "$job"
    }

    //Super & this

    fun printAllInfo():String{
        return super.printInfo()
    }

    fun printJobInfo():String{
        return this.job
    }
}

