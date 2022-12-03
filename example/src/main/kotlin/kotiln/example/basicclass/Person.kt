package kotiln.example.basicclass

import kotlinx.coroutines.*

fun main() = runBlocking {
    doWorld()
    println("Done")
}

// Concurrently executes both sections
suspend fun doWorld() = coroutineScope { // this: CoroutineScope
    launch {
        delay(500L)
        println("World 2")
    }
    launch {
        delay(100L)
        println("World 1")
    }
    println("Hello3")
}