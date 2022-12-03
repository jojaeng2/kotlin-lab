package kotiln.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExampleApplication {


}


fun main(args: Array<String>) {
    println(add(5, 6, 7))
}

fun add(a: Int, b: Int, c: Int) = a + b + c