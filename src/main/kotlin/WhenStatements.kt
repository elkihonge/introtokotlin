fun main(args: Array<String>) {

    print("Enter number to Indicate Floor")
    var floor= readLine()!!.toInt()

    when(floor){
        1 -> println("Go to First floor")
        2 -> println("Go to Second floor")
        3 -> println("Go to Third floor")
        4 -> println("Go to Fourth floor")

        else -> println("Invalid floor")
    }


}