package lesson_19

class SpaceShip {

    fun takeOff() {
        println("Корабль взлетает!")
        // TODO: Добавить логику управления двигателями, проверки безопасности и т.д. (явная пометка)
    }

    fun land() {
        TODO("Реализация приземления еще не завершена. Требуется написать логику посадки.")
    }

    fun fireAtAsteroid() {
        println("Корабль открыл огонь по астероиду!")
    }
}

fun main() {
    val ship = SpaceShip()

    ship.takeOff()
    ship.fireAtAsteroid()

    try {
        ship.land()
    } catch (e: NotImplementedError) {
        println("Ошибка: ${e.message}")
    }
}