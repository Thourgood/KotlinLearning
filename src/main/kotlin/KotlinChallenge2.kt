/*For a given input string of words, create a function that returns the longest word in the string.
For an added challenge, you can create an output that lists the longest word along with the number of
characters in the word. */


fun findLongestWord(input: String): String {
    val words = input.split(" ")
    var longestWord = ""

    for (word in words) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }

    return longestWord
}

fun main() {
    val input = "Dogs are the best little creatures"
    val longestWord = findLongestWord(input)
    println("Longest word: $longestWord")

    val longestWordLength = longestWord.length
    println("Longest word: $longestWord length: $longestWordLength")
}