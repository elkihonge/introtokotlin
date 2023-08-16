package OOP


open class Animal(color:String,legs:String,breed:String,gender:String ) {
    init {

        println("It is $color in color,It has $legs legs,Of $breed breed,It is a $gender")

    }

    class Dog(name:String) : Animal("brown","four","rototiller","male"){

        fun nameofdog() {
            println("Bosco")
            //println("It is $color in color,It has $legs legs,Of $breed breed,It is a $gender")
        }
    }
}

fun main(args:Array<String>) {
    var dog1 = Animal.Dog("Bosco")
    dog1.nameofdog()
}