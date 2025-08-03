package lesson_20

import kotlin.random.Random

class Robot {
    private val phrases = listOf(
        "Привет, я робот!",
        "Я умею говорить.",
        "Сегодня хороший день.",
        "Люблю математику и логику.",
        "Kotlin - отличный язык!"
    )

    private var modifier: ((String) -> String)? = null

    fun setModifier(newModifier: (String) -> String) {
        modifier = newModifier
    }

    fun say() {
        val phrase = phrases[Random.nextInt(phrases.size)]
        val modifiedPhrase = modifier?.invoke(phrase) ?: phrase
        println(modifiedPhrase)
    }
}

fun reverseWords(text: String): String {
    return text.split(" ").reversed().joinToString(" ")
}

fun main() {
    val robot = Robot()

    println("Робот говорит (обычная фраза):")
    robot.say()
    println("\nУстанавливаем модификатор (инвертирование слов)...")
    robot.setModifier { phrase -> reverseWords(phrase) }
    println("\nРобот говорит (инвертированная фраза):")
    robot.say()
}