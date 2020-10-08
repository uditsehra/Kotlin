//Hello World Program
fun main(){
    strinConcatenation()
}

// To declare a function we use "fun" keyord followed by funtionName() and in curly braces you can write our code
// Use funtion println() to print something.








// Declaring variables in Kotlin

fun variablesBasic(){

    var a: String = "initials"      //1
    println(a)
    val b: Int = 1                  //2
    val c = 3                       //3
    println(b)
    println(c)

}
/*
1. Declares a mutable variable and initializing it.
2. Declares an immutable variable and initializing it.
3. Declares an immutable variable and initializing it without specifying the type. The compiler infers the type Int.
*/

fun notInitalizingVariable(){
    var e: Int = 10
    println(e)
    // Declaring a variable without initialization will give error 
    // You're free to choose when you initialize a variable, however, it must be initialized before the first read.
}


fun variables(){
    val a: String = "Hello World"
    val b: Int = 10
    val c: Boolean = true
    val d: Float = 10.0F
    val e: Double = 10.9
    println(a)
    println(b)
    if (c){
        println("C is True")
    }
    else{
        println("C is False")
    }
    println(d)
    println(e)

    
}







/*
        Difference between var and val

        var - is a variable whereas,
        val - is a final value that cannot be reassigned again.

        we can assign values var again but cannot do the same with val,

        so it is suggested that you should use var if you want to change the values of the variable at a later point
*/











//  Using Lateinit for Initialization

/*
lateinit means late initialization.
If you do not want to initialize a variable in the constructor instead you want to initialize it later on and if you can guarantee the initialization before using it,
then declare that variable with lateinit keyword. It will not allocate memory until initialized
While using 'lateinit'  you must declare the type of the variable
*/
lateinit var f: String

fun lateInitialize(){
    f = "Initialize now."
    println(f)
}






//      Understanding Null Safety in Kotlin

/*
In an  effort to rid the world of the 'NullPointerException' , variable types in Kotlin do not allow the assignment of 'null'
If you need a variable that can be 'null', declare it nullable by adding '?' at the end of its type. 
*/

//fun nullableFunction(){
//    var isNull: String? = "This can't be null"  //This is not nullable
//    isNull = null                               // This line will give error as it's not nullabl
//    var nullable: String? = "This can be nullable"
//    nullable = null                             // This is valid as it's initialized as a nullable variable
//    val size1 = nullable.length                  // This will give you an error, to resolver this issue use 'nullable?.length'
//    var len = nullable?.length                  // This is correct, but this may give you a null value
//    var size: Int = nullable?.length            // This is not valid cause types your are requiring here is an Int but you're gettign a null, so what we can do is
//    var size = nullable?.length!!               // We know that nullable is null, this !! means irrespective of the type of the variable it(!!) converts any value to non null and it will throws an exception(NullPointerException) if the value is null
//
//}
//Example of this will be like, you created some null variable and you changed it's value later so,
var fadd: String? = "Not null"
var size: Int = fadd?.length!!

fun exampleOfNullable(){
    println(size)
    fadd = "Kill me now"
    val lenOfFNullable: Int = fadd?.length!!
    println(lenOfFNullable)
}
// To deal with NPE we also use Elvis Operator(?:)
// Follow this link https://kotlinlang.org/docs/reference/null-safety.html




//              String concatenation using '$' sign

fun strinConcatenation(){
    val f: String = "Kill me"
    println("Please ${f.capitalize()} tomorrow maybe and length of this string is ${f.length}")
}
