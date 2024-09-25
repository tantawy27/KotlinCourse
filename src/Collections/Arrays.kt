package Collections

fun main() {

    val item1=arrayOf(1,"Ahmed",2,3)
    item1.forEach{ println(it)}

    println("==========================")

    val item2= intArrayOf(1,2,3,5,8)
    item2.forEach{ println(it) }

    println("==========================")

    val item3= doubleArrayOf( 1.0 , 2.5 , 3.0 , 5.0 , 8.3 )
    item3.forEach{ println(it) }

    println("==========================")

    val item4=arrayOf(
        User("Ahmed","Tantawy"), User("Mohamed","Tantawy")
    )

    item4.forEach { println (it) }


    println("==========================")

    val updateUser=item4.plus(User("Usama","Tamer"))

    updateUser.forEach { println (it) }


    println("==========================")

    item4[0]= User("Foo","Bar")

    val index = item4[0]
    println(index)
    println("==========================")
    item4.forEach { println(it) }

}


class User(var firstName:String,var lastName:String) {

   var fullName: String = "$firstName $lastName"

    override fun toString(): String {
        return fullName
    }

}