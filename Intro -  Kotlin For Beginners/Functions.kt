//********************************************Functions******************************* */
//Declarations,      'fun' keyword is used to define a function. After fun keyword functionName(): returnType.

fun main(){

    println(printArgs(2,3,4,5,6,7))
    
}

//Function name should be in CamelCase
fun getName():String{
    return "Budda"
}

//**************************************Arguments in a function************************************ */
// Example below will show you how a function takes an argument.
// After functionName() put the argument name and it's type in parenthesis.
fun square(number: Int): Int {
    return number*number;
}

//A single line function function with minimal functionality can be declared in a single line as follows.
fun squareSingleLine(number: Int) = number*number
fun square1(number:Int):Int = number*number
fun square2(number: Int): Int = if(number>0)number*number else 0

//********************************Types of Arguments***************************************************** */
/*
There are mainly three types of arguments which we can pass in fucntion.
1. Positional arguments
2. Default arguments
3. Named arguments
examples of different types of arguments calls.

Positional arguments
getUser("Hobo", 22, true)

Default arguments
getUser(name: String, age:Int = 18, isActive:Boolean = false)

Named arguments
getUSer(age=33, isActive=true, name="Akash")
*/
fun getUser(name:String, age:Int, isActive:Boolean):String{
    return "Name : $name\nAge: $age"
}

//**************************************************************************************************** */

//********************************************varargs as a function arguments**************************** */
// varargs basicallly allows us to send multiple values in arguments or it allows us to use multiple parameters as arguments when we don't know that how many input does the user is going to provide us.
fun printArgs(vararg number:Int)
{
    println("The size is ${number.size}")
    for (no in number) println(no)
}