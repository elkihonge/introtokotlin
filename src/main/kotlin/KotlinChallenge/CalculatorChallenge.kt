package KotlinChallenge

fun main(args: Array<String>) {
    println("Enter first number: ")
    var num1:Float = readLine()!!.toFloat()

    print("Enter the operator (+, -, *): ")
    var operator = readLine()


    println("Enter second number: ")
    var num2:Float = readLine()!!.toFloat()


    if (num1 != null && operator != null && num2 != null) {
        var result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2


            else -> null
        }

        if (result != null) {
            println("Result: $result")
        }
    } else {
        println("Invalid input. Please enter valid numbers and an operator.")
    }
}



