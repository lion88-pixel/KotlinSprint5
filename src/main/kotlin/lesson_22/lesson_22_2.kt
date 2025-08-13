package lesson_22

class RegularBook2(val title: String, val author: String)

data class DataBook2(val title: String, val author: String)

fun main() {
    val regularBook2 = RegularBook2("The Fellowship of the Ring", "Tolkien")
    val dataBook2 = DataBook2("The Two Towers", "Tolkien")
    println("RegularBook2: $regularBook2")
    // Обычные классы по умолчанию не имеют переопределённого метода toString().
    // Dыводится представление объекта, а не его содержимое.
    println("DataBook2: $dataBook2")
    // Data классы автоматически генерируют метод toString(), который выводит значения всех свойств класса.
    // Это позволяет увидеть, какие данные хранятся в объекте.
}