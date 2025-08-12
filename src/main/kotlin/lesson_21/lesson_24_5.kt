package lesson_21

fun Map<String, Int>.maxCategory(): String? {
        return maxByOrNull { it.value }?.key
}

fun main() {
    val skillMap1 = mapOf("Сила" to 150, "Ловкость" to 180, "Интеллект" to 100)
    val skillMap2 = mapOf("Сила" to 100, "Ловкость" to 100, "Интеллект" to 100)
    val skillMap3 = emptyMap<String, Int>()

    println("Наибольший опыт в skillMap1: ${skillMap1.maxCategory()}")
    println("Наибольший опыт в skillMap2: ${skillMap2.maxCategory()}")
    println("Наибольший опыт в skillMap3: ${skillMap3.maxCategory()}")
}