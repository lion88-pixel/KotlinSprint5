package lesson_20

fun main() {
    val greeting: (String) -> String = { username ->
        "С наступающим Новым Годом, $username!"
    }
    val username = readln()
    val message = greeting(username)
    println(message)
}