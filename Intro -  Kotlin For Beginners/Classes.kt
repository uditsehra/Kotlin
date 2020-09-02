/*  ******************************************Classes in Kotlin********************************************************************** */

/*Classes in Kotlin are declared using th keyword 'class'
        class className{ /......./}
The class declaration consists of the class name, the class header(specifying its type, parameters, the primary costructors etc.) and the class body, surrounded by curly braces. Both the header and the body are optional;
If the class has no body braces can be omitted.
        class Empty
 */
//Example of classes
class Account{

    //Properties    
    var accNo:Int = 0
    var name:String? = null
    var ammount: Float = 0f

    //Member functions
    fun deposit(money:Float){
        ammount += money
        println(ammount)
    }

    fun withdraw(money:Float){
        if(money>ammount){
            println("Not sufficient ammount,\nAmmount ${ammount}\nWithdraw ${money}")
        }
        else{
            ammount -= money
            println(ammount)
        }
    }

    fun insertAccountDetails(acc:Int, n:String, amt:Float)
    {
        accNo = acc
        name = n
        ammount = amt
    }

    fun getAccountDetails(){
        println("Account No : ${accNo}\nAccount Holder Name : ${name}\nAmmount : ${ammount}")
    }

}

//*********************************************This keyword************************************ */
//          This points to the current reference of the current class
//Example

class AccountThisExample{
    var accNo:Int = 0
    var name:String = ""
    var ammount:Float = 0f

    //Since the name of all the arguments of setDetails function and properties of this class are same this is used to point to current class reference of it properties
    fun setDetails(accNo:Int, name:String, ammount:Float)
    {
        this.accNo = accNo
        this.name = name
        this.ammount = ammount
        println("${accNo}\n${name}\n${ammount}")
    }
}




//********************************************Constructors*********************************** */
/*
It is a function with same name as class name
It is used to construct or initialize the class
Two types of constructors
1. Primary Constructors - only 1
2. Secondary Constructors - Multiple secondary constructor

The primary constructor is part of the class header: it goes after the class name (and optional type parameters).
        class Person constructor(firstName: String) { \*...*\ }

If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted:
        class Person(firstName: String) { \*...*\ }
        
The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks, which are prefixed with the ****"init"**** keyword.

During an instance initialization, the initializer blocks are executed in the same order as they appear in the class body, interleaved with the property initializers:

        class InitOrderDemo(name: String) {
            val firstProperty = "First property: $name".also(::println)
    
            init {
                println("First initializer block that prints ${name}")
            }
    
            val secondProperty = "Second property: ${name.length}".also(::println)
    
            init {
                println("Second initializer block that prints ${name.length}")
            }
        }

Note that parameters of the primary constructor can be used in the initializer blocks. They can also be used in property initializers declared in the class body:
        class Customer(name: String) {
            val customerKey = name.toUpperCase()
        }

If the constructor has annotations or visibility modifiers, the constructor keyword is required, and the modifiers go before it:
        class Customer public @Inject constructor(name: String) { \*...*\ }

******************************************************************************************************************************************/ 

/*************************************************************** "init" keyword **********************************************************/
/*
 init is used to write the constructor initialisation code.
Example
*/

class ConstructorExample(accNo:Int, name: String, ammount: Int)
{
    var accNo: Int
    var name : String
    var ammount : Int

    init{
        this.accNo = accNo
        this.name = name.toUpperCase()
        this.ammount = ammount
    }

    fun getDetails()
    {
        println("${accNo}\n${name}\n${ammount}")
    }
}

//********************************************************************************************************************************

/**************************************************************Secondary Constructor**********************************************/
/*

The class can also declare secondary constructors, which are prefixed with constructor:

            class Person {
                var children: MutableList<Person> = mutableListOf<>()
                constructor(parent: Person) {
                    parent.children.add(this)
                }
            }

*/
//Examples of Secondary Constructor

class School {
    var regNo:Int = 1
    var name: String = ""
    var fatherName: String = ""
    var motherName: String = ""
    var add: String = ""
    var bloodGroup: String = ""


    constructor(fatherName:String, regNo:Int){
        this.fatherName = fatherName.capitalize()
        this.regNo = regNo
    }

    constructor(motherName:String){
        this.motherName = motherName
    }
}



fun main(){
/*   
    val account = Account()
    account.insertAccountDetails(1331, "Hobo", 1000f)
    account.getAccountDetails()
    account.deposit(100f)
    account.withdraw(50f)
    val account = AccountThisExample()
    account.setDetails(1331, "HOBO", 100f)
    val account  = ConstructorExample(1331, "Hobo", 10000)
    account.getDetails()
 */ 
    val student = School("Heil HObo")
    val student1 = School("Kill Me", 1234)
    val arr = arrayListOf()
}