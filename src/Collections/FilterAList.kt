package Collections

fun main() {
    val names = listOf("ahmed","khaled","mohamed","ali","tamer","ahmed")
    val filter=names.filter { it != "ahmed" }
    println(filter)

    println("====================================")

    val filter2=names.filter { it=="ahmed" }
    println(filter2)

    println("====================================")

    val ages = listOf(23,18,85,10,40,11,16,9)
    val filter3=ages.filter { it>=18 }
    println(filter3)

    println("====================================")

    val filter4=ages.filter(::isChild)               //:: Call Function
    println(filter4)
















}

fun isChild(value:Int):Boolean{
    return value <= 18
}