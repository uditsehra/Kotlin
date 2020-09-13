// Here we will see how an iterator works in case of a multi thread.
import java.util.concurrent.CopyOnWriteArrayList

val numList = CopyOnWriteArrayList<Int>()

fun main(args: Array<String>) {
    for (i in 0 until 1000){
        numList.add(i)
    }


    Thread{dropMultiples(3)}.start()
    Thread{dropMultiples(5)}.start()
    Thread{dropMultiples(7)}.start()

    for (i in numList){
        println(i)
    }
}

fun dropMultiples(n: Int){
    val itr = numList.iterator()
    while(itr.hasNext()){
        val i = itr.next()
        if(i % n == 0)
        {
            itr.remove()
        }
    }
}

// Now if we run this code we'll get 'ConcurrentModificationException' because we are doing changes in three places cause we are using three threads.
/*  To fix this we have several ways of fixing it
    1.  We can use the same iterator over the same threads.
                
                    fun dropMultiples(n: Int, itr: MutableIterator<Int>){
                        val itr = numList.iterator()
                        while(itr.hasNext()){
                            val i = itr.next()
                            if(i % n == 0)
                            {
                                itr.remove()
                            }
                        }
                    }

                    fun main(args: Array<String>) {
                        for (i in 0 until 1000){
                            numList.add(i)
                        }

                        val itr = numList.iterator()

                        Thread{dropMultiples(3, itr)}.start()
                        Thread{dropMultiples(5, itr)}.start()
                        Thread{dropMultiples(7, itr)}.start()

                        for (i in numList){
                            println(i)
                        }
                    }

                    but still we will get some error of concurrency, think why?
    
    2.  Easiest way will be to change the array list to CopyOnWriteArrayList<Int>()
*/

/*
Code will work.

import java.util.concurrent.CopyOnWriteArrayList

val numList = CopyOnWriteArrayList<Int>()

fun main() {
    for (i in 0 until 1000){
        numList.add(i)
    }

    val itr = numList.iterator()
    Thread{dropMultiples(3, itr)}.start()
    Thread{dropMultiples(5, itr)}.start()
    Thread{dropMultiples(7, itr)}.start()
    for (i in numList){
        println(i)
    }
}

fun dropMultiples(n:Int, itr:MutableIterator<Int>){
    var itr = numList.iterator()
    while (itr.hasNext()){
        val i = itr.next()
        if (i%n==0){
            itr.remove()
        }
    }
}

*/