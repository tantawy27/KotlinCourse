package Collections

fun main() {
    val names = listOf("ahmed","khaled","mohamed","ali","tamer","ahmed")
    val find = names.find { it=="ahmed" }
    print("$find " )
    println(find?.length)

    println("====================================")

    val find2=names.first{it == "ahmed"}
    println(find2)

    println("====================================")
    val find3=names.firstOrNull{it == "Mohab"} //* Returns the first element matching the given [predicate], or `null` if element was not found.
    println(find3?.length)

}