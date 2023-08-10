import java.util.Calendar

fun main(args: Array<String>) {
    //write a simple kt programme !enter year born it displays age!

    println("Enter year born")
    var birthYear:Int = readLine()!!.toInt()
    var currentYear:Int = Calendar.getInstance().get(Calendar.YEAR)
    var age = currentYear - birthYear

        if (age < 0) {
            println("Invalid birth year. The year should be in the past.")
        } else {
            println("Your age is $age years.")
        }
}



