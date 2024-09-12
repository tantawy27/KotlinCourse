package oop

class D (var firstName:String,lastName:String) {

    var fullName:String ="$firstName $lastName"
        get() = "FullName:$field"                            //Override property getter

        set(value) {                                        //Override property setter
            if(value.startsWith("Ahmed")){
                field="Mohammmed Tantawy"
            } else {
                field="Sayed Ahmed"
            }
        }
}


fun main() {
    val obj=D ("Ahmed","Tantawy")
    println(obj.fullName)
    obj.fullName="Ahmed"
    println(obj.fullName)
    obj.fullName="ali"
    println(obj.fullName)
}