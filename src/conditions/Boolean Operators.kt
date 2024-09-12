package conditions

/*
    And Gate -> &&
    Or Gate---> ||
    Not Gate -> !

*/
fun main() {
    var yourage:Int =30
    var myage:Int =30

    if ((myage==yourage)&&(myage==yourage)) {    //  true&&true
        println("true")
    }

    if ((myage==yourage)&&(myage!=yourage)) {   //True&&false
        println("true")
    }
    else {
        println("false")
    }

    //another method
    println((myage==yourage)&&(myage!=yourage)) //result=false
    println("==============================================")
    println((myage==yourage)||(myage!=yourage)) //result=true

    }