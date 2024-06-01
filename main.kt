fun main() {
   // House(1, 5.5, "blue",500.5)
   // House("colorMwaka", 4)
    val house = House("blue", 5)
    house.mediumFunction(true)
    house.simpleFunction()
}

class House(color: String, rooms: Int) {

    var color: String
    var rooms: Int
    init {
        this.color = color
        // println(this.color)
    }

    init {
        this.rooms = rooms
        // println(this.rooms)
    }

    fun simpleFunction() {
        println("This is a simple function")
    }

    fun mediumFunction(mediumFunction: Boolean) {
        println("This is is a medium function $mediumFunction")
    }
    // constructor(rooms: Int, bathrooms: Double, color: String): this(color, rooms){
    //     println("House color $color,  no. of $bathrooms, no. of rooms $rooms")
    // }

    // constructor(rooms: Int, bathrooms: Double, color: String, rentFee: Double):                 this(color, rooms){
    //     println("rent fee $rentFee")
    // }
}