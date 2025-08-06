package lesson_21

fun String.vowelCount(): Int {
    return count { it in "aeiouAEIOU" }
}

fun main() {
    val text1 = "hello"
    val text2 = "Kotlin!"
    println("Количество гласных в '$text1': ${text1.vowelCount()}")
    println("Количество гласных в '$text2': ${text2.vowelCount()}")
}