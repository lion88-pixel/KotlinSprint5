package lesson_21

import java.io.File
import java.io.IOException

fun File.prependWord(word: String) {
    try {
        val currentText = this.readText()
        val newText = word.lowercase() + "\n" + currentText
        this.writeText(newText) // Записываем новую строку в файл
        println("Слово '$word' успешно добавлено в начало файла ${this.name}")
    } catch (e: IOException) {
        println("Ошибка при записи в файл ${this.name}: ${e.message}")
    }
}

fun main() {
    val file = File("words.txt")

    if (!file.exists()) {
        file.createNewFile()
        println("Файл ${file.name} создан.")
    }

    file.prependWord("Hello")
    file.prependWord("World")
    file.prependWord("Kotlin")
}