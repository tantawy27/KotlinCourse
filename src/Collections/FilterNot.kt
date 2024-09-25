package Collections

fun main() {
    val names = listOf("Ahmed","khaled","mohamed","Ali","tamer","Ahmed")
    val filter=names.filterNot { it.contains("A") }
    println(filter)
}