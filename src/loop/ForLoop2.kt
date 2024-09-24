package loop

fun main(){
//example 1

//      *
//      **
//      ***
//      ****
//      *****


//    val rows = 5
//    for (i in 1..rows){
//        for(j in 1 .. i){
//            print("*")
//        }
//        println()
//    }


//example 2

//    *****
//    ****
//    ***
//    **
//    *


//    val rows = 5
//
//    for (i in rows downTo  1){
//        for(j in 1..i)
//            print("*")
//
//        println()
//    }


//example 3
/*
    1
    2 3
    4 5 6
    7 8 9 1 0
 */


    val rows=4
    var number=1

    for (i in 1..rows ){
        for (j in 1..i){

            print("$number ")
            ++number

        }
        println()
    }













}