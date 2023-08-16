package KotlinChallenge

fun main(args: Array<String>){
    println("Enter a letter")
    var letter = readLine()!!.toString().trim()
    if (letter.isBlank()){
        println("Valid input")
    }else{
        var chara = letter[0].toLowerCase()

        var result = if (chara in "a,e,i,o,u"){
            println("$chara is a vowel ")
        }else{
            println("$chara is a consonant")
        }


    }







}