package conditions

fun main()
{

    var price:Int = 80

    if(price==25)
    {
        println("the price is $price")
    }
    else if (price<25) {
        println("the price is good")
    }
    else if (price>25) {
        println("the price is expensive")
    }
    else {
        println("not found")
    }

    //===================================================
    println ("===================================================")
    //to make single line ifElse
    var myAge = 15
    if (myAge>18) println("your age is $myAge") else println("your age is less than 18 ")
}

