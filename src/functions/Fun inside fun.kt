package functions

fun main() {
    sayHiAndBye()
    sayHiAndBye2()
}

fun sayHiAndBye() { //parent

    println("HI!")

    fun sayBye() {  //child
        println("Bye")

    }

    sayBye() //parent call child
    println("======================================")

}


fun sayHiAndBye2(){ //parent2

    println("HI!")

    fun sayBye2() {  //child2
        print("Bye")

        fun name2(){ // grandson2
         println(" Ahmed")
        }

        name2() // child2 call grandson2
    }
    sayBye2() //parent call child2
}




