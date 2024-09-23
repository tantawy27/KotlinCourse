package Modifiers

//Access Modifiers
/*
1-public            //Default
2-private           //Not allow to use
3-protected         // only allow to use if it inherited to other class
*/
//open class A {
//
//    protected var name:String=""
//
//    /*private*/ fun printName():String{
//        return name
//    }
//}
//
//class B:A() {
//
//    fun print(){
//        super.name
//    }
//
//}
//
//
//
//fun main() {
//    val obj=B()
//
//    obj.print()
//    obj.printName()
//}



///Encapsulation

//Method 1

//open class A {
//
//    private var name:String=""
//
//    fun setName(p_name:String){
//        this.name=p_name
//    }
//
//    fun getName():String{
//        return this.name
//    }
//
//
//
//}
//
//class B:A() {
//
//    fun print():String{
//        super.setName("Tantawy")
//        return super.getName()
//        println("===========================================")
//
//    }
//
//
//
//}


//Method 2

open class A {

    private var name:String=""


    var setAndGetName:String
            get()=this.name

        set(value) {
            this.name=value
        }




}

class B:A() {
     fun print():String{
         return super.setAndGetName
     }

}



fun main() {

    val obj1=A()
    obj1.setAndGetName="Mohammed"
    println(obj1.setAndGetName)


    val obj2=B()

    obj2.setAndGetName="Ahmed"
    println(obj2.setAndGetName)

}

