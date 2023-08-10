fun main(args: Array<String>) {
    println("Enter weight")
    var num1:Float = readLine()!!.toFloat()
    println("Enter height")
     var num2:Float = readLine()!!.toFloat()

   var result = num1/((num2/100)*(num2/100))
   println(result)



}