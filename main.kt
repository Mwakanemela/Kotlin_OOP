fun main() {
   val house = House(1, 5.5, "blue")
}

class House(color: String) {
    constructor(rooms: Int, bathrooms: Double, color: String): this(color){
        println("House color $color,  no. of $bathrooms, no. of rooms $rooms")
    }
}