package Collections

fun main() {
    var items = mutableMapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California",
        "FL" to "Florida",
        "MN" to "Minnesota",
        "AZ" to "Arizona"
    )
    val result = items.map(::finValue)      //:: Call Function
    println(result)
println("============================")
    val result1 = items.mapNotNull(::finValue)      //:: Call Function
    println(result1)


}

fun finValue(entry:Map.Entry<String,String>):Map.Entry<String,String>?{
    if (entry.key.startsWith("N")) {
        return null
    }else{
        return entry
    }

}

