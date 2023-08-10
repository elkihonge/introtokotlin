fun main(args: Array<String>) {

    println("Welcome to the MPESA bundle options!")
    println("Select a bundle:")
    println("1. Daily Bundle")
    println("2. Weekly Bundle")
    println("3. Monthly Bundle")
    println("4. Exit")

    var userInput = readLine()!!.toInt()

    when (userInput) {
        1 -> {
            println("You've selected the Daily Bundle.")
            when(1){
                1 ->

            }
        }
        2 -> {
            println("You've selected the Weekly Bundle.")

        }
        3 -> {
            println("You've selected the Monthly Bundle.")

        }
        4 -> {
            println("Exiting the bundle options.")
        }
        else -> {
            println("Invalid selection. Please choose a valid option.")
        }
    }
}
