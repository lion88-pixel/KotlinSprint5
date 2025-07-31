package lesson_20

class Player(val name: String, var currentHealth: Int, val maxHealth: Int) {
    fun displayHealth() {
        println("$name: Здоровье - $currentHealth/$maxHealth")
    }
}

fun main() {
    val healingPotion: (Player) -> Unit = { player ->
        player.currentHealth = player.maxHealth
        println("${player.name} выпил зелье и полностью восстановил здоровье!")
    }
    val player = Player("Герой", 50, 100)
    player.displayHealth()
    healingPotion(player)
    player.displayHealth()
}