package abstractClasses

abstract class Person(val name:String) {
    init {
        println("My name is $name")
    }

    fun displayId(id:Int){
        println("my id is$id")
    }

    abstract fun displayJob(desc:String)
}

class Teacher(name:String):Person(name){
    override fun displayJob(desc: String) {
        println(desc)
    }
}


fun main() {
    val teacher1=Teacher("Ahmed Sayed")
    teacher1.displayJob("Iam a software developer")
    teacher1.displayId(2024)
}