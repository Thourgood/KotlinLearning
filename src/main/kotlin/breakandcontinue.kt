fun main(args: Array<String>) {

    for (c in "python") {
        if (c == 'o') {
            break
        }
        print(c)
    }
    println()
    val list = listOf("Book", "Table", "Laptop")
    for (str in list) {
        if (!str.contains('o')) {
            continue
        }
        print(str)
    }
}

