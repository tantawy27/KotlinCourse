package DataTypes

fun main() {
     var isBlank:Boolean = false
    println (isBlank)

    println(isBlank.not())  // push to not gate
    isBlank= "tantawy".isBlank() //isBlank method to check its empty or not
    println(isBlank)

    isBlank= "".isBlank()
    println(isBlank)
}

