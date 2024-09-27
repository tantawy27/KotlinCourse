package conditions


fun main() {

    //Kotlin Ternary Operator

    //val name: String? = null
    val name: String? = "Sayed"

    //OLD Method
//    if(name!=null){
//        println(name.length)
//    }else{
//         0
//    }

    //Ternary Operator Method

    val length = if (name != null) name.length else 0
    println(length)


}