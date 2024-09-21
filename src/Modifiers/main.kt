package Modifiers

//Access Modifiers
/*
1-public            //Default
2-private           //Not allow to use
3-protected         // only allow to use if it inherited to other class
*/
open class A {

    protected var name:String=""

    /*private*/ fun printName():String{
        return name
    }
}

class B:A() {

    fun print(){
        super.name
    }

}



fun main() {
    val obj=B()

    obj.print()
    obj.printName()
}

