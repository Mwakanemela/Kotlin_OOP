fun main() {
   val house = House(1, 5.5, "blue")
   House("colorMwaka")
}

class House(color: String) {

    var color: String
    init {
        this.color = color
        println(this.color)
    }
    constructor(rooms: Int, bathrooms: Double, color: String): this(color){
        println("House color $color,  no. of $bathrooms, no. of rooms $rooms")
    }
}