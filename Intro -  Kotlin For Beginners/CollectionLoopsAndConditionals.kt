//      In this file we will learn about Collections, Loops and Conditionals

//***********Using an array********************************************************************************************************************

// It works on vararg
/*[vararg]: It tells you that you can have n number of arguments inside any function */
fun arrayExample(){

    /*To create an array, we can use a library function arrayOf() and pass the item values to it, so that arrayOf(1, 2, 3) creates an array [1, 2, 3].
    Alternatively, the arrayOfNulls() library function can be used to create an array of a given size filled with null elements. */

    val number = arrayOf(1,2,3,4,5)
//    number.forEach{println(it)}
    
    val name = arrayOf("Kill", "John","1", "2", 1, 2) // No particular type of array is defined.
//    name.forEach{println(it)}

    val nameString = arrayOf<String>("This", "Only", "contains", "strings")          // String is the type of this array.
//    nameString.forEach{println(it)}

    /*Another option is to use the Array constructor(it only takes two arguments Size and the values of array) that takes the array size and the function that can return the initial value of each array element given its index:*/
    val newArray = Array(5, {i -> i*1}) // This will create an array with values {0, 1, 4, 9, 16}
//    newArray.forEach{println(it)}

    // Accessing value of an array
    println(name[2])
    newArray[4] = 69
    println(newArray.get(4)) // Both of these will work fine.

    // Null Array
    
    val nullArray = arrayOfNulls<String>(10)        // We can define a null array in this way

    //One of the best things about arrays in Kotlin is that you necessarily not need to define the size of array while using arrayOf(), you can define the type of array by arrayOf<typeOfArray>()

}

//******************************************************************************************************************************************************************************/

//      Lists

/*A list is an ordered collection of items.
In Kotlin, lists can be either mutable (MutableList) or read-only (List).
For list creation, use the standard library functions listOf() for read-only lists and mutableListOf() for mutable lists.
To prevent unwanted modifications, obtain read-only views of mutable lists by casting them to List. */

fun listExamples(){
    val listOfNames = listOf<String>("Hello", "World", "Budda")// List are immutable by default in Kotlin you can not change it once you initialise it.
    // To make a mutable list
    var mutableListOfNames = mutableListOf<String>("Hello", "World")

    //Adding
    mutableListOfNames.add("Kill me now")
    mutableListOfNames.addAll(3, listOf("I", "Will", "Kill", "Them", "All"))
//    mutableListOfNames.forEach{println(it)}
    println(mutableListOfNames)

    //Updating
    /* Lists also offer a function to replace an element at a given position - set() and its operator form []. set() doesn't change the indexes of other elements.*/
    val numbers = mutableListOf("one","five", "three")
    numbers[1] = "two"
    println(numbers)
    //fill() simply replaces all the collection elements with the specified value
    val nums = mutableListOf(1, 2, 3, 4, 5)
    nums.fill(3)
    println(nums)

    //Removing
    /*To remove an element at a specific position from a list, use the removeAt() function providing the position as an argument. All indices of elements that come after the element being removed will decrease by one. */
    val allNums = mutableListOf(1, 2, 3, 4)
    allNums.removeAt(2)
    println(allNums)

    //For removing the first and the last element, there are handy shortcuts removeFirst() and removeLast(). Note that on empty lists, they throw an exception. To receive null instead, use removeFirstOrNull() and removeLastOrNull()
    val number = mutableListOf(1, 2, 3, 4, 5)
    number.removeFirst()
    number.removeLast()
    println(number)

    val empty = mutableListOf<Int>()
    empty.removeFirstOrNull()
}



/*************************************************************************************************************************************/

//***********************************Maps*************************************************




fun main(){
//    arrayExample()
    listExamples()
}