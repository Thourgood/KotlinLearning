import java.util.*
// no parameters no return value
fun helloWorld() {
        println("Hello World")
    }
// 1 parameter, no return value
fun printWithSpaces(text: String) {
    for (char in text) {
        print(char + " ")
    }
    println()
}
// no parameters returns date
fun getCurrentDate(): Date {
    return Date()

}
// 2 parameters returns Int
fun max(a:Int, b:Int): Int {
    if (a >= b) {
        return a
    } else {
        return b
    }

}
fun main(args: Array<String>) {
    printWithSpaces("cheese")
    println(getCurrentDate())
    println(max(20, 30))
}