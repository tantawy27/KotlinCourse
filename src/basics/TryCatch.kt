package basics

fun main() {

    val user=UserInfo("sayed",9)


    try{
        checkAge(user)
        println("Done")
    }
//    catch (ex:Exception){
//        when(ex){
//            is NullPointerException -> println("NullPointerException")
//            is IllegalArgumentException->println("IllegalArgumentException")
//            else ->throw ex
//        }
//        println("Catch the Exception")
//    }

    finally {
        println("Finally")                 // done whatever exception or not
    }

}

private fun checkAge(p:UserInfo){
    if(p.age<18){
        throw ArithmeticException ("Error")
    }
}
data class UserInfo(val name:String,val age:Int)