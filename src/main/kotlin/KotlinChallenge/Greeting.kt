package KotlinChallenge

fun main(args: Array<String>) {
    println("What is your name?")
    var name:String =readLine()!!.toString().trim()

    if (name.isBlank()) {
        println("Enter a valid name ")
    }else {
        println("Hello $name,welcome to this page ")
    }
}