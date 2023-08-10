fun main(args: Array<String>) {

    println("Enter your marks")
    var marks: Int = readLine()!!.toInt()

    if (marks < 0 || marks > 100) {
        println("Invalid marks")
    }
    else if (marks >= 50) {
        println("Congratulations you passed your exams")
    }
    else {
        println("Sorry you have to reseat")
    }

    if (marks <= 29) {
        println("E")
    }
    else if (marks <= 39) {
        println("D")
    }
    else if (marks <= 59) {
        println("B")
    }
    else if (marks <= 70) {
        println("B+")
    }
    else if (marks <= 100) {
        println("A")
    }
}

