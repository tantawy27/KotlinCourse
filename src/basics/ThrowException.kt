package basics

fun main() {
//throw an exception
    val p = PersonInfo("Ahmed",10)
    if(p.age <18){
        throw InvalidException(p.age,"User in no old enough")
    }
}


class InvalidException(val age: Int,message:String):Exception("invalid age :$age , $message")


data class PersonInfo(val name:String ,val age:Int)