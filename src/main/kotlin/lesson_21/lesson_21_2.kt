package lesson_21

fun List<Int>.evenNumbersSum(): Int =
   filter { it % 2 == 0 }.sum()

fun main() {
    val numbers1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numbers2 = listOf(1, 3, 5, 7, 9)
    println("Сумма четных чисел в списке 1: ${numbers1.evenNumbersSum()}")
    println("Сумма четных чисел в списке 2: ${numbers2.evenNumbersSum()}")
}