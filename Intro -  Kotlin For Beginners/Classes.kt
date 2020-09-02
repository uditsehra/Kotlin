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


fun main(){
//    val account = Account()
//    account.insertAccountDetails(1331, "Hobo", 1000f)
//    account.getAccountDetails()
//    account.deposit(100f)
//    account.withdraw(50f)
    val account = AccountThisExample()
    account.setDetails(1331, "HOBO", 100f)
}