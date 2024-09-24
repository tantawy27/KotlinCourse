package myInterfaces

interface MyInterfaces1:
    MyInterfaces2,
    MyInterface3,
    MyInterface4
{   //cannot create object

    fun bar()     //abstract by default
    fun foo() {

    }
}


open class Test{

}

open class Test2{

}



class Demo:Test(),MyInterfaces1,       //only inheritance from 1 class and several interface
MyInterfaces2
    {
    override fun bar() {
        TODO("Not yet implemented")
    }


}




fun main() {
    val obj1= Demo()
    obj1.bar()

}