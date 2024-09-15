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

}






enum class AccountType(val points:Int,val followers:Int) {
    BRONZE(10,100),
    SILVER(20,200),
    GOLD(30,300),
    PLATINUM(40,400)
}





class UserLevel(var name:String,accountType: AccountType){

}