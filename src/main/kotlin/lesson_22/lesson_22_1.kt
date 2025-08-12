package lesson_22

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {
    val regularBook1 = RegularBook("The Lord of the Rings", "Tolkien")
    val regularBook2 = RegularBook("The Lord of the Rings", "Tolkien")
    val dataBook1 = DataBook("The Hobbit", "Tolkien")
    val dataBook2 = DataBook("The Hobbit", "Tolkien")
    val regularComparison = regularBook1 == regularBook2
    println("RegularBook comparison: $regularComparison")
    val dataComparison = dataBook1 == dataBook2
    println("DataBook comparison: $dataComparison")
}