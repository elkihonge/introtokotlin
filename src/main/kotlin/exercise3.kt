fun main(args: Array<String>) {

    println("Enter your marks")
    var marks: Int = readLine()!!.toInt()
    if (marks >= 50) {
        println("Congratulations you passed your exams")
    }
    else {
        println("Sorry you have to reseat")
    }

    if (marks in 0..29) {
        println("E")
    }
    else if (marks in 30..39) {
        println("D")
    }
    else if (marks in 40..49) {
        println("C")
    }
    else if (marks in 50..59) {
        println("B")
    }
    else if (marks in 60..69) {
        println("B+")
    }
    else if (marks in 70..100) {
        println("A")
}
    else{
        println("Invalid")
    }

}
