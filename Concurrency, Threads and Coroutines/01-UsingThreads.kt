/*
This code is an example of how you can basically use threads.
 */

val numList = ArrayList<Int>()

fun main(args: Array<String>) {
    for (i in 0 until 1000)
    {
        numList.add(i)
    }
    Thread{ printList("1")}.start()
    Thread{ printList("2")}.start()
    Thread{ printList("3")}.start()
}

fun printList(id: String){
    for (i in 0 until 1000)
    {
        if (id == "2" && i == 500)
        {
            Thread.sleep(100)
        }

        if( i % 100 == 0)
        {
            println(" $id $i")
        }
    }
}