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

//************************************Lists********************************

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
    /*To remove an element at a specific position from a list, use the removeAt() function providing the position as an argument.
    All indices of elements that come after the element being removed will decrease by one. */
    val allNums = mutableListOf(1, 2, 3, 4)
    allNums.removeAt(2)
    println(allNums)

    //For removing the first and the last element, there are handy shortcuts removeFirst() and removeLast(). Note that on empty lists, they throw an exception.
    //To receive null instead, use removeFirstOrNull() and removeLastOrNull()
    val number = mutableListOf(1, 2, 3, 4, 5)
    number.removeFirst()
    number.removeLast()
    println(number)

    val empty = mutableListOf<Int>()
    empty.removeFirstOrNull()
}

    //Null Lists
    /*
    listOf(null,null) => [null, null]
    var list: List<Int?> = listOf(null, null)       //A list of int which can be null.
    var list2:List<Int>? = null                     //Defines a null list.
    */



/*************************************************************************************************************************************/

//***********************************Maps*************************************************

/*
A map is a collection of key/value pairs, where each key is unique and is used to retrieve the corresponding value. For creating maps, there are functions mapOf() and mutableMapOf().
A read-only view of a mutable map can be obtained by casting it to Map.
*/

fun mapExample(){
    var mapOfNames = mapOf<Int, String>(0 to "Heil", 1 to "Hobo")       // This is a read only map, immutable, Map is immutable and hashMap is mutable.
    var mapNameStrings = mapOf<String, String>("Name" to "Hobo", "Age" to "20", "Motto" to "Heil! Hobo")
    //To access the value of a map
    println(mapOfNames[1])  // prints Hobo
    println(mapNameStrings["Motto"])

    //HasMap
    var hashMapNameStrings = hashMapOf("Name" to "Hobo", "Age" to "20", "Motto" to "Heil! Hobo")
    hashMapNameStrings.set("Action","Kill them all")    //This is how you add another pair of key value pair to a hashMap, or you can also use a mutableMapOf<>()
    println(hashMapNameStrings["Action"])

    //Mutable Map
    var mutableMap = mutableMapOf<Int, String>(1 to "kasjdfl", 2 to "aldskfja")
    mutableMap.set(69, "this is 69")
    println(mutableMap[69])

    // Below line will give error cause mapOf is immutable.
//    mapOfNames.set(100, "This is 100")
}

    //Maps Specific Operations
    fun mapOperations(){

    //*************************************Retriving keys and values*********************************************************************.
    /*
    Retrieving keys and values
    For retrieving a value from a map, you must provide its key as an argument of the get() function. The shorthand [key] syntax is also supported. If the given key is not found, it returns null. There is also the function getValue() which has slightly different behavior: it throws an exception if the key is not found in the map. Additionally, you have two more options to handle the key absence:

        getOrElse() works the same way as for lists: the values for non-existent keys are returned from the given lambda function.
        getOrDefault() returns the specified default value if the key is not found.
     */
        val numerMap = mutableMapOf("One" to 1, "two" to 2, "three" to 3)
        println(numerMap.get("One"))                    // 1
        println(numerMap["One"])                        // 1
        println(numerMap.getOrDefault("four", 10))      // 10
        println(numerMap["five"])                       // null
//        numerMap.getValue("six")                        // exception!

    /*
    To perform operations on all keys or all values of a map, you can retrieve them from the properties keys and values accordingly.
    'keys' is a set of all map keys and values is a collection of all map values.
    */
    println(numerMap.keys)//[One, two, three]
    println(numerMap.values)//[1, 2, 3]



    //********************************************************************************************************************************* */
    //***************************************Filtering********************************************************************************* */
    
    /*
    You can filter maps with the filter() function as well as other collections. When calling filter() on a map, pass to it a predicate with a Pair as an argument.
    This enables you to use both the key and the value in the filtering predicate.
    */
    numerMap.set("eleven1",11)
    val filteredMap = numerMap.filter{(key, value) -> key.endsWith("e") && value > 1}
    println(filteredMap)

    /*
    There are also two specific ways for filtering maps: by keys and by values. For each way, there is a function: filterKeys() and filterValues().
    Both return a new map of entries which match the given predicate.
    The predicate for filterKeys() checks only the element keys, the one for filterValues() checks only values.
    */

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredKeysMap = numbersMap.filterKeys { it.endsWith("1") }
    val filteredValuesMap = numbersMap.filterValues { it < 10 }
    println(filteredKeysMap)
    println(filteredValuesMap)

    /**********************************************************************************************************************************/

    /***********************************************************Plus and Minus operator*******************************************************/
    
    /*
    Due to the key access to elements, plus (+) and minus (-) operators work for maps differently than for other collections.
    plus returns a Map that contains elements of its both operands: a Map on the left and a Pair or another Map on the right.
    When the right-hand side operand contains entries with keys present in the left-hand side Map, the result map contains the entries from the right side.
    */
    val numbersMap1 = mapOf("one" to 1, "two" to 2, "three" to 3)
    println(numbersMap1 + Pair("four", 4))
    println(numbersMap1 + Pair("one", 10))
    println(numbersMap1 + mapOf("five" to 5, "one" to 11))
    //minus creates a Map from entries of a Map on the left except those with keys from the right-hand side operand.
    //So, the right-hand side operand can be either a single key or a collection of keys: list, set, and so on.
    println(numbersMap1 - "one")
    println(numbersMap1 - listOf("two", "four"))

    //************************************************************************************************************************************ */

    //*******************************************************Adding and Removing************************************************************************** */

    /*
    Adding and updating entries
    To add a new key-value pair to a mutable map, use put().
    When a new entry is put into a LinkedHashMap (the default map implementation), it is added so that it comes last when iterating the map.
    In sorted maps, the positions of new elements are defined by the order of their keys.

    To add multiple entries at a time, use putAll(). Its argument can be a Map or a group of Pairs: Iterable, Sequence, or Array.
    */

    val numbersMap2= mutableMapOf("one" to 1, "two" to 2)
    numbersMap2.put("three", 3)
    println(numbersMap2)

    numbersMap2.putAll(setOf("four" to 4, "five" to 5, "six" to 6))
    println(numbersMap2)

    //Both put() and putAll() overwrite the values if the given keys already exist in the map. Thus, you can use them to update values of map entries.

    /*
    You can also add new entries to maps using the shorthand operator form. There are two ways:
        plusAssign (+=) operator.
        the [] operator alias for put().
    */
    numbersMap2["three"] = 3     // calls numbersMap.put("three", 3)
    numbersMap2 += mapOf("four" to 4, "five" to 5)
    println(numbersMap2)


    /*
    Removing entries

    To remove an entry from a mutable map, use the remove() function.
    When calling remove(), you can pass either a key or a whole key-value-pair.
    If you specify both the key and value, the element with this key will be removed only if its value matches the second argument.
    */

    numbersMap2.remove("one")
    println(numbersMap2)
    numbersMap2.remove("three", 4)            //doesn't remove anything
    println(numbersMap2)

    }

//**********************************************Main************************/
fun main(){
//    arrayExample()
//    listExamples()
//    mapExample()
    mapOperations()
}
