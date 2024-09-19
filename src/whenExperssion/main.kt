package whenExperssion

fun main() {

    val user1= User("Ahmed","Tantawy")


    when{
        user1.firstname=="Ahmed"&&user1.lastName=="Tantawy"->
        println("this is ahmed tantawy")

        else->println("this is not ahmed tantawy")
    }


//    when(user1.firstname){
//        "Ahmed"-> println("this is Ahmed")
//        "tantawy"->println("this is my father")
//        else->println("this is not ahmed tantawy")
//    }

}



class User (var firstname:String,var lastName:String){

}

//Exhaustive vs Non exhaustive When Expressions at enumAccountType file