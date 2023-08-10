fun main(args: Array<String>) {

    print("Enter number to select bundle")
    var input = readLine()!!.toInt()

    when(input){
        1 -> println("Data Deals")
        2 -> println("Daily Bundles")
        3 -> println("Weekly + Free YouTube")
        4 -> println("GO MONTHLY")

        else -> println("Invalid input")
    }


}