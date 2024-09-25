package Collections

fun main() {

    //listOf is read-only list

    val item = listOf(1, 2, 3, 4, 5)
    item.forEach { (println(it)) }

    println("================================")

    val users = listOf(User("Ahmed", "Tantawy"), User("Mohamed", "Tantawy"))
    users.forEach { println(it) }

    println("================================")

    val first = users.first()
    println(first)

    println("================================")

    val last=users.last()
    println(last)

    println("================================")

    val name:String?=null
    val stuff=if (name == null) emptyList() else listOf(name)
    println(stuff)

}