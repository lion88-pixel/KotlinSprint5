package lesson_20

fun main() {
    val items = listOf("Кнопка 1", "Текст 2", "Изображение 3", "Поле ввода 4", "Ссылка 5", "Заголовок 6")
    val lambdaList = items.map { item ->
        { println("Нажат элемент $item") }
    }
    for (i in lambdaList.indices) {
        if (i % 2 == 0) {
            lambdaList[i]()
        }
    }
}