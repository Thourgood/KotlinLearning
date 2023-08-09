//Given positive integer n implement a function which returns a list containing all steps from n to 0.
fun countDown(n: Int): List<Int> {
    return (n downTo 0).toList()
}

fun main(args: Array<String>) {
    val countdownList = countDown(9)
    println(countdownList)
}

