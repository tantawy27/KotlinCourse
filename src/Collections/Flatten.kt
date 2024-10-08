package Collections

fun main() {
    val fruits1 = listOf("Apple","Orange","Banana","Avocado")
    val fruits2 = listOf("Blueberries","Lemon","Mango")
    val fruits3 = listOf("Passion Fruit","Watermelon")

    val allFruits = listOf(fruits1,fruits2, fruits3)
    println(allFruits)
    println(allFruits.flatten())

    println("======================================")
    println("How to Combine Multiple Immutable Lists in Kotlin")

    val result=fruits1.plus(fruits2).plus(fruits3)
    println(result)
    println(result.minus(fruits3))
    println(result.minus("Lemon"))






//    val fruits1 = arrayOf("Apple","Orange","Banana","Avocado")
//    val fruits2 = arrayOf("Blueberries","Lemon","Mango")
//    val fruits3 = arrayOf("Passion Fruit","Watermelon")
//
//    val allFruits = arrayOf(fruits1,fruits2, fruits3)
//    println(allFruits)
//    println(allFruits.flatten())
}