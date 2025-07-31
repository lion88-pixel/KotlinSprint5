package lesson_20

class Player(val name: String, var hasKey: Boolean = false) {
    fun displayInfo() {
        println("Имя: $name, Ключ: ${if (hasKey) "Есть" else "Нет"}")
    }
}

fun main() {
    val openDoor: (Player) -> String = { player ->
        if (player.hasKey) {
            "Игрок ${player.name} открыл дверь"
        } else {
            "Дверь заперта"
        }
    }
    val player1 = Player("Герой 1")
    player1.displayInfo()
    println(openDoor(player1))
    val player2 = Player("Герой 2", true)
    player2.displayInfo()
    println(openDoor(player2))
}