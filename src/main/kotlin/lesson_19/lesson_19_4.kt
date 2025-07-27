package lesson_19

enum class AmmoType(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    var currentAmmo: AmmoType? = null

    fun loadAmmo(ammoType: AmmoType) {
        currentAmmo = ammoType
        println("Танк заряжен патронами типа ${ammoType.name}")
    }

    fun fire() {
        if (currentAmmo == null) {
            println("Танк не заряжен! Невозможно выстрелить.")
        } else {
            println("Выстрел! Нанесен урон: ${currentAmmo!!.damage}")
            currentAmmo = null
        }
    }
}

fun main() {
    val tank = Tank()
    tank.fire()
    tank.loadAmmo(AmmoType.BLUE)
    tank.fire()
    tank.loadAmmo(AmmoType.GREEN)
    tank.fire()
    tank.loadAmmo(AmmoType.RED)
    tank.fire()
    tank.fire()
}