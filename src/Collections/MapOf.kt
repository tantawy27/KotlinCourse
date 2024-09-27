package Collections

fun main () {
    //How to Create a map in kotlin

    val names = mapOf(
        1 to "Ahmed",
        2 to "khaled",
        3 to "ali",
        4 to "Sayed",
        5 to "Mohab"

    )

    val result = names[3]
    println(result)
println("==================================")
    val result2 = names.containsKey(5)                      //Returns true if the map contains the specified key.
    println(result2)
println("==================================")
    val result3=names.containsValue("Sayed")                //Returns true if the map maps one or more keys to the specified value.
    println(result3)
println("==================================")
    val result4=names.entries                               //Returns a read-only Set of all key/value pairs in this map.
    println(result4)
println("==================================")
    val result5=names.values
    println(result5)
println("======================================")
    println("How to Create a Mutable Map")
    var names2 = mutableMapOf(
        1 to "Mohamed",
        2 to "Tamer",
        3 to "Osama",
        4 to "Ali",
        5 to "Mohab"
    )

    names2.put(6, "Ahmed")
    println(names2)

    names2.remove(4)
    println(names2)


    names2.getOrPut(4, { "Tark" })
    println(names2)


    names2.getOrPut(1, { "Mohamed" })
    println(names2)

println("======================================")
    println("How Filter with Mutable Map")
    var items = mutableMapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California",
        "FL" to "Florida",
        "MN" to "Minnesota",
        "AZ" to "Arizona"
    )

    val filter = items.filter { it.key.contains("N") }
    println(filter)

    println("============================")

    val filter2 = items.filterKeys { it.contains("N") }
    println(filter2)

    println("============================")
    val filter3 = items.filterKeys { it.contains("N") }
        .map { it.value.substring(0,3) }
    println(filter3)


    println("============================")

    val filter4 = items.filterKeys { it.contains("N") }
        .mapValues { it.value.substring(0,3) }                      //Returns a map with entries having the keys of this map and the values
    println(filter4)


}

