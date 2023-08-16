fun main(args: Array<String>) {
    print("Number 1: ")
    val num1 = readLine()!!.toInt()

    print("Number 2: ")
    val num2 = readLine()!!.toInt()

    printSum(num1, num2)
}

fun printSum(num1: Int, num2: Int) {
    val sum = sumNumbers(num1, num2)
    print(sum)
}

fun sumNumbers(num1: Int, num2: Int): Int {
    return num1 + num2
}
