package OOP.polymorphism

//super class
open class Building (val type: String) {
    open fun openDoor(){
        println("$type door is opening")
    }
}


//sub class
class House(type:String): Building(type){
    override fun openDoor(){
        println("$type house door is opening")
    }
}
class Apartment(type:String): Building(type){
    override fun openDoor(){
        println("$type apartment door is opening")
    }
}
class Restaurant(type:String): Building(type){
    override fun openDoor(){
        println("$type restaurant door is opening")
    }
}


fun main(args: Array<String>) {
    var building:Building = House("The Bungalow")//House object is being treated like a building
    building.openDoor() //calls the overridden method in house

    var building2:Building = Apartment("The One bedroom")
    building2.openDoor()

    var building3:Building = Restaurant("Sankara")
    building3.openDoor()
}

