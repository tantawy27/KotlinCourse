package oop

const val USER_NAME_FIELD="UserName"                    //const must be in:-
                                                        // 1- top-level
                                                        // 2- object in class (companion object)

fun main() {
    val obj=UserInfo("ahmed","tantawy")

    UserInfo.MAX_AGE

    USER_NAME_FIELD

}


class UserInfo(var firstName:String,var lastName:String) {
    companion object                                   // make a default object with need to make a new one in main
    {
      const val MAX_AGE=30

    }


}