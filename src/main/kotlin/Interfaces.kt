

interface Driveable {
    fun drive()
}

class Car(val colour: String): Driveable {
    override fun drive() {
        println("Driving car...")
    }
}

class Motorcycle(val colour: String): Driveable {
    override fun drive() {
        println("Driving motorcycle...")
    }
}