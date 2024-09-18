package DataTypes

fun main() {

    val myByte:Byte = 8
    val myShort:Short=16
    val myInt:Int=32
    val myLong:Long=64


    //Decimals

    val myFloat:Float=32.00F         //F means float
    val myDouble:Double=64.00


    println(myByte::class)           // ::Class :to know the Data type.
    println(myByte.toLong())         //Converts this Byte value to Long.
    println(myByte.toLong()::class)   // ::Class :to know the Data type.


    val newInt = myInt.plus(12)

    println(newInt)



}