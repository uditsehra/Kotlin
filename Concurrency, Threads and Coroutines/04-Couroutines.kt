/*
    Coroutines allows us to use worker thread as a result they use a pool of threads, and then each coroutine can be scheduled on a particular thread.
    And if the thread has started something and is waiting for it to end so the thread might be free so what Kotlin coroutines does that it reutilizes those threads
    and do more number of tasks with less number of threads. Its a light weight thread.

    Below is the exampel of a coroutine program.
*/



/*

One can think of a coroutine as a light-weight thread. Like threads, coroutines can run in parallel, wait for each other and communicate.
The biggest difference is that coroutines are very cheap, almost free: we can create thousands of them, and pay very little in terms of performance.
True threads, on the other hand, are expensive to start and keep around. A thousand threads can be a serious challenge for a modern machine.

So, how do we start a coroutine? Let's use the launch {} function:

            launch {
                ...
            }

This starts a new coroutine. By default, coroutines are run on a shared pool of threads.
Threads still exist in a program based on coroutines, but one thread can run many coroutines, so there's no need for too many threads.

Let's look at a full program that uses launch:

            println("Start")
            
            // Start a coroutine
            GlobalScope.launch {
                delay(1000)
                println("Hello")
            }
            
            Thread.sleep(2000) // wait for 2 seconds
            println("Stop")
            println("Start")
            ​
            // Start a coroutine
            GlobalScope.launch {
                delay(1000)
                println("Hello")
            }
            ​
            Thread.sleep(2000) // wait for 2 seconds
            println("Stop")

Here we start a coroutine that waits for 1 second and prints Hello.

We are using the delay() function that's like Thread.sleep(), but better: it doesn't block a thread, but only suspends the coroutine itself.
The thread is returned to the pool while the coroutine is waiting, and when the waiting is done, the coroutine resumes on a free thread in the pool.

The main thread (that runs the main() function) must wait until our coroutine completes, otherwise the program ends before Hello is printed.


If we try to use the same non-blocking delay() function directly inside main(), we'll get a compiler error:

Suspend functions are only allowed to be called from a coroutine or another suspend function

This is because we are not inside any coroutine. We can use delay if we wrap it into runBlocking {} that starts a coroutine and waits until it's done:

            runBlocking {
                delay(2000)
            }
So, first the resulting program prints Start, then it runs a coroutine through launch {}, then it runs another one through runBlocking {} and blocks until it's done, then prints Stop. Meanwhile the first coroutine completes and prints Hello

*/