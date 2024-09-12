package oop

/* class User constructor(var firstName:String,var lastName:String,var isPlatinum:Boolean){ //"constructor" can be removed -> class user ()

    constructor(firstName: String,lastName: String):this(firstName,lastName,false){
        println("2nd")
    }
    constructor(firstName: String):this(firstName,"None"){
        println("3rd")
    }






    fun printFullName()
    {
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix:String) {
        println("$prefix $firstName")
    }

    fun firstNameLength(){
        println("${firstName.length}")
    }

} */



//class User (var firstName:String,var lastName:String,var isPlatinum:Boolean){
//
//    var fullName="$firstName $lastName"
//
//    var age:Int
//
//    init {
//        println("hello from init")
//        println("this class for user $fullName ")
//        age =25
//        println("$age")
//    }
//
//    constructor(firstName: String,lastName: String):this(firstName,lastName,false){
//        println("2nd")
//    }
//
//
//}

//Class Properties

class User (var firstName:String,var lastName:String){

    var fullName= "$firstName $lastName"

    init {                         //init block done first

        println("hello 1")
        println ("this class for user $fullName")

    }

}







