import java.awt.datatransfer.StringSelection

open class Person(open var name: String,open var age: Int) {

    init {

        println("Object was created")
    }

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name")
    }


    }

class Student(override var name: String, override var age: Int): Person(name, age) {

}


class Employee(override var name: String, override var age: Int): Person(name, age) {

}


fun main(args: Array<String>) {
    val student = Student("James", 30)
    student.speak()
}
