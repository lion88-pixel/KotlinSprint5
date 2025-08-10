package lesson_21

fun Map<String, Int>.maxCategory(): String? {
    if (isEmpty()) {
        return null
    }

    var maxCategory: String? = null
    var maxExperience = Int.MIN_VALUE

    for ((category, experience) in this) {
        if (experience > maxExperience) {
            maxExperience = experience
            maxCategory = category
        }
    }
    return maxCategory
}

fun main() {
    val skillMap1 = mapOf("Сила" to 150, "Ловкость" to 120, "Интеллект" to 100)
    val skillMap2 = mapOf("Сила" to 100, "Ловкость" to 100, "Интеллект" to 100)
    val skillMap3 = emptyMap<String, Int>()

    println("Наибольший опыт в skillMap1: ${skillMap1.maxCategory()}")
    println("Наибольший опыт в skillMap2: ${skillMap2.maxCategory()}")
    println("Наибольший опыт в skillMap3: ${skillMap3.maxCategory()}")
}