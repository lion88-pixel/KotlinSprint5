package lesson_22

data class Person(val name: String, val age: Int, val city: String)

fun main() {
    val person = Person("Alex", 37, "Moscow")
    val (name, age, city) = person
    println("Name: $name")
    println("Age: $age")
    println("City: $city")
}