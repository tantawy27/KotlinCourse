package nullSafety

//NullPointerException()    "NPE"


fun main() {

//    var name:String= "tamer"
//    name= null
//    println(name)

    var name:String?= "tamer"   // (?)can be set null
    name= null
    println(name)

    var age:Int?=25
    age=null
    println(age)


    //safe calls  ->   ?.

    var firstname:String?="Mohammed"

    var length = firstname?.length      //?. if it not null then do
    println(length)

    println("=======================================================")

    var lastname:String?="Ahmed"

    var lenth2=lastname?.length
    println(lenth2)

    println("=======================================================")


    var length3 = if (lastname !=null)lastname.length else 0
    println(length3)

    println("=======================================================")

    var length4= lastname?.substring(0,2)?.length   //substring : to get certain num of string
    println(length4)

    println("=======================================================")

    //Elvis Operator

    var lastname2:String?="Mohammed Tamer"
//    lastname2=null
    var length5= if(lastname2 != null) lastname2.length else -1
    println(length5)

    //by Elvis Operator ?:

    var length6=lastname2?.length ?: -1       //?: "else"
    println(length6)
    println("=======================================================")

    //"The Double bang operator"   "!! Operator"   //to convert any value to Non-null

    println("the !! operator")

    var name2:String?= "Mohammed"
    var length7=name2!!.length
    println(length7)

    var name3:String?= "ahmed"
    var length8=name3!!.length     //!! "sure not null " "if null it will give NullPointerException error "
    println(length8)


    var sayHi:String?=null
    var length9= sayHi?.length   //"?." if iam not sure if it null or not
    println(length9)


}
