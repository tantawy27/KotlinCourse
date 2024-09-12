package functions

fun main() {
   // person("ahmed",25)
    person("ahmed",25, isHappy = true)
    println("====================================")
    person("tamer",18, isHappy = true)
    println("====================================")
    person("mohammed",25, isHappy = false)

    //Named arguments
    person(name="sayed",age=10, isHappy = true)
}

//fun person (name:String,age:Int) {
//
//    println("$name,and your age is $age")
//}


fun person(name:String,
           age:Int,
           isHappy:Boolean,
           job:String="developer") { // to make default value job:String=

    if (age<21){
        println("your name is $name,and your age is $age, and your job is $job" )
    }
    else
    {
        println("sorry")
    }

    println("are you happy? $isHappy")


}

