package lesson_21

class Player(val name: String, var currentHealth: Int, val maxHealth: Int) {
    fun displayHealth() {
        println("$name: Здоровье - $currentHealth/$maxHealth")
    }
}

fun Player.isHealthy(): Boolean {
    return currentHealth == maxHealth
}

fun main() {
    val player1 = Player("Герой 1", 100, 100)
    val player2 = Player("Герой 2", 50, 100)
    player1.displayHealth()
    println("Игрок здоров: ${player1.isHealthy()}")
    player2.displayHealth()
    println("Игрок здоров: ${player2.isHealthy()}")
}