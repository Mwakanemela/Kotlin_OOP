fun main() {
   val house = House(1, 5.5, "blue")
   House("colorMwaka", 4)
}

class House(color: String, rooms: Int) {

    var color: String
    var rooms: Int
    init {
        this.color = color
        println(this.color)
    }

    init {
        this.rooms = rooms
        println(this.rooms)
    }
    constructor(rooms: Int, bathrooms: Double, color: String): this(color, rooms){
        println("House color $color,  no. of $bathrooms, no. of rooms $rooms")
    }
}