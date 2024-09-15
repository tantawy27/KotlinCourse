package oop

fun main() {
    println(AccountType.PLATINUM)
    val accountTypeFromApi="Gold"


    val accountType=AccountType.valueOf(accountTypeFromApi.uppercase())
    println(accountType)


   // val user = UserLevel("ahmed",AccountType.PLATINUM)


    println("=============================================")

    println(AccountType.PLATINUM)
    println(AccountType.PLATINUM.points)
    println(AccountType.PLATINUM.followers)

    println("=============================================")

    println(AccountType.GOLD)
    println(AccountType.GOLD.points)
    println(AccountType.GOLD.printString())


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