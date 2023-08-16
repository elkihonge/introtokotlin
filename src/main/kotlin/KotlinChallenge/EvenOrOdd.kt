package KotlinChallenge

fun main(args: Array<String>) {
    println("Write integer: ")
    var number:Int = readLine()!!.toInt()


    if (number != null ) {
        if (number % 2 == 0) {
            println("$number is even.")
        } else {
            println("$number is odd.")
        }
    } else {
        println("Invalid input. Please enter a valid number.")
    }





}





