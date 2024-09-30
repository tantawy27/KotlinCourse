package inheritance

import jvm.UserInfo

class Person(var name :String,cst:UserInfo) {
   init {
       val test=cst.customer("Data")
   }

    fun printInfo(){
        println("your name is $name")
    }


}