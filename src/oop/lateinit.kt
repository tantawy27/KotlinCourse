package oop

fun main() {

    val obj = Info("Ahmed","tantawy")
    obj.favoriteCity="Cairo"
    println(obj.toString())

}

class Info(var firstName:String,var lastName:String){
   lateinit var favoriteCity:String                     // give its value lately


    fun fullName():String="$firstName $lastName"

    override fun toString(): String {            //to string = convert to string
        return fullName() + " favorite city is : $favoriteCity"
    }
}