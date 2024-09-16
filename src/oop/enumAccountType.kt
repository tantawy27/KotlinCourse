package oop

fun main() {
//    println(AccountType.PLATINUM)
//    val accountTypeFromApi="Gold"
//
//
//    val accountType=AccountType.valueOf(accountTypeFromApi.uppercase())
//    println(accountType)
//
//
//   // val user = UserLevel("ahmed",AccountType.PLATINUM)
//
//
//    println("=============================================")
//
//    println(AccountType.PLATINUM)
//    println(AccountType.PLATINUM.points)
//    println(AccountType.PLATINUM.followers)
//
//    println("=============================================")
//
//    println(AccountType.GOLD)
//    println(AccountType.GOLD.points)
//    println(AccountType.GOLD.printString())
//
//    println("=============================================")
//    //Iterate Over Enum Values
//
//    println("using for loop")
//
//    for (i in AccountType.values()){
//        println(i)
//    }
//
//    println("=============================================")
//
//    println("using forEach")
//
//    AccountType.values().forEach { println(it) }


    //Exhaustive vs Non exhaustive When Expressions

    val accountType =AccountType.PLATINUM

    val msg = when (accountType){

        AccountType.BRONZE ->{
            "Bronze Member Access Allowed"

        }
        AccountType.SILVER ->{
            "Sliver Member Access Allowed"

        }
        AccountType.GOLD ->{
            "Gold Member Access Allowed"

        }
        AccountType.PLATINUM ->{
            "Platinum Member Access Allowed"

        }
        else -> "Unkown member type"
    }

    println(msg)

}






enum class AccountType(val points:Int,val followers:Int) {
    BRONZE(10,100) {
        override fun printString(): String {
            return "points:$points,Followers:$followers"
        }
    },
    SILVER(20,200) {
        override fun printString(): String {
            return "points:$points,Followers:$followers"
        }
    },
    GOLD(30,300) {
        override fun printString(): String {
            return "points:$points,Followers:$followers"
        }
    },
    PLATINUM(40,400) {
        override fun printString(): String {
            return "points:$points,Followers:$followers"
        }
    };

    abstract fun printString():String                     // to override after





//class UserLevel(var name:String,accountType: AccountType){

}