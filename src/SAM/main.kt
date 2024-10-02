package sam

fun interface MyInter {
    fun printInfo(name: String, age: Int): String

}


fun main() {
    val obj = MyInter { name: String, age: Int -> name + " " + age }    //Lambda Exp

//    val obj = object : MyInter {
//        override fun printInfo(name: String, age: Int): String {
//        }
//    }

    println(obj.printInfo("Tamer", 25))

}