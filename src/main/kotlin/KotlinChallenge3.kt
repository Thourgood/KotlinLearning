/* Given positive integer n implement a function which
calculates sum of all numbers from 1 up to (and including) number n. */
object AddUp {
    fun addUpTo(n: Int): Int {
        if (n == 1) {
            return 1
        }

        return n + addUpTo(n - 1)
    }
}

fun main() {
    val result = AddUp.addUpTo(5)
    println("Sum: $result")
}