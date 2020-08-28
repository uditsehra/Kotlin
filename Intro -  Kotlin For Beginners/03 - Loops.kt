//Loops in Kotlin

//Traditional For Loop

fun TraditionalForLoop(){

    var namesMap = mapOf("Shubham" to "Singh", "Rohit" to "Badugu", "Kaali" to "Gori")
    namesMap.forEach{
        println(it)
    }

    val nameArray = arrayOf<String>("Raju", "rohit", "Abhishek", "Motu", "patlu")
    nameArray.forEach{
        println(it)
    }
}

//*********************************************************************************************************/
//  For Loop

fun forLoop(){
    val nameArray = arrayOf<String>("Raju", "rohit", "Abhishek", "Motu", "patlu")

    // Here in this loop, it will save the value of each iteration in name variable.
    for (name in nameArray){
        println(name)
    }

    // for loop for range
    // Here 0 and 10 are inclusive
    for (i in 0..10){
        println(i)
    }

    println("***********************************************************")
    
    // For in which upperbound is exclusive
    // Here 10 will be exclusive and 0 will be inclusive
    for (i in 0 until 10)
    {
        println(i)
    }

    // For with steps
    // Here it will increase its value with 2 in every iteration
    for(x in 0 until 10 step 2){
        println(x)
    }

    // For with decrememnt
    for(x in 10 downTo 0 step 1){
        println(x)
    }

}

//********************************************************************************************************************/



fun main(){
//    TraditionalForLoop()
//    forLoop()

}
