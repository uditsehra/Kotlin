/*
A higher order function is a function that takes function as parameters, or returns a function.
Lamda functions are also higher order functions.
*/
fun main(){
    var name:String = "Budda"
    higherOrderFunctionExample(name,{

    })
}


fun doNothing(isActive:Boolean):Unit{
    println("Hello")
}

fun higherOrderFunctionExample(name:String, doNothing:(isActive:Boolean)->Unit):String{
    if(name == "Buuda"){
        doNothing(true)
    }else{
        doNothing(false)
    }
    return "Hi! $name\nHow are you"
}

