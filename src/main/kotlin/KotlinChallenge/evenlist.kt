package KotlinChallenge

fun main(args: Array<String>) {

        var numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        var evenNumbers = numbers.filter { it % 2 == 0 }

        println("Original list: $numbers")
        println("Even numbers: $evenNumbers")

}