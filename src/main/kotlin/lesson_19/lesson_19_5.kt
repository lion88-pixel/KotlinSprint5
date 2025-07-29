package lesson_19

enum class Gender {
    MALE,
    FEMALE,
    OTHER
}

class Person(val name: String, val gender: Gender) {
    fun displayInfo() {
        println("Имя: $name, Пол: ${gender.name}")
    }
}

fun main() {
    val personList = mutableListOf<Person>()
    println("Добро пожаловать в Картотеку!")
    println("Введите имя и пол человека в формате: Имя Пол")
    println("Доступные значения для пола: ${Gender.entries.joinToString(", ") { it.name }}")
    repeat(5) { i ->
        while (true) {
            print("Введите данные человека (${i + 1}/5): ")
            val input = readln().split(" ")
            if (input.size != 2) {
                println("Ошибка: Неверный формат ввода. Пожалуйста, введите имя и пол через пробел.")
                continue
            }
            val name = input[0]
            val genderString = input[1].uppercase()
            val gender: Gender? = try {
                Gender.valueOf(genderString)
            } catch (e: IllegalArgumentException) {
                null
            }

            if (gender == null) {
                println("Ошибка: Неверное значение для пола. Используйте: ${Gender.entries.joinToString(", ") { it.name }}")
                continue
            }

            val person = Person(name, gender)
            personList.add(person)
            println("Человек добавлен в картотеку.")
            break
        }
    }
    println("\nКартотека:")
    personList.forEach { person -> person.displayInfo() }
}