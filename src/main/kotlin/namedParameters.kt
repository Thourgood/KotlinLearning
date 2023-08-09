
class House(val height: Double, val colour: String, val price: Int) {

    fun print() {
        println("House [height=$height, colour=$colour, price=$price]")
    }
}

fun main(args: Array<String>) {
    val house = House(4.5, "Blue", 150000)
    house.print()
}