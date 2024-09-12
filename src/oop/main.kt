package oop


fun main() {
   // var user = User(firstName = "sayed", lastName = "ahmed")           //make an Object form class   var obj_name = class_name()
   // user.printFullName()
    // user.printWithPrefix("Mr.")

    println("=========================================")

   //var user2 = User("ahmed","tantawy")           //make an Object form class   var obj_name = class_name()
    //user2.printFullName()
    //user2.firstNameLength()

    println("=========================================")

    //var user3=User("Ali")


//    var user4=User("ahmed","tantawy")


    var user5=User("ahmed","tantawy")
    println(user5.fullName)

    user5.fullName="Hello World"
    println("after change it will be ${user5.fullName}")


}