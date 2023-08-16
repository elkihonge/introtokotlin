package KotlinChallenge

fun main(args: Array<String>){
    var numbers = listOf(12, 7, 22, 8, 5, 16, 10, 14, 3, 6)

    var evenNumbers = mutableListOf<Int>()

    for (n in numbers) {
        if (n % 2 == 0) {
            evenNumbers.add(n)
        }
    }

    println("Original list: $numbers")
    println("Even numbers: $evenNumbers")
}
