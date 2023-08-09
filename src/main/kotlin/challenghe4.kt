class Book(val title: String, val author: String, val year: Int, var borrowed: Boolean) {

    init {

        println("Object was created")
    }

    fun bookBorrowed() {


    }

    fun greet(name: String) {
        println("Hello $name")
    }


}



fun main(args: Array<String>) {
    val book = Book("James and the Giant Peach", "Me", 2023, true)
    println(book.title)
    println(book.author)
    println(book.year)
    println(book.borrowed)
}


