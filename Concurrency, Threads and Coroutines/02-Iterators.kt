/*
        This is a example of how an iterator works in as single thread.
*/
val numList = ArrayList<Int>()

fun main(args: Array<String>) {
    for (i in 0 until 1000){
        numList.add(i)
    }
    dropMultiples(3)
    dropMultiples(5)
    dropMultiples(7)

    for( i in numList){
        println(i)
    }
}

fun dropMultiples(n: Int){
    val itr = numList.iterator()    //Declairing an iterator
    while(itr.hasNext()){           //This loops runs only if there exists something after the current value of the iterator.
        val i = itr.next()
        if (i % n == 0){
            itr.remove()
        }
    }
}