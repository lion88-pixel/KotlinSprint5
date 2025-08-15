package lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime?,
    val distanceLightYears: Double
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri System",
        description = "The closest star system to our Sun. It consists of three stars: Alpha Centauri A, Alpha Centauri B, and Proxima Centauri.",
        dateTime = null,
        distanceLightYears = 4.37
    )
    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val dateTime = alphaCentauri.component3()
    val distance = alphaCentauri.component4()

    println("Name: $name")
    println("Description: $description")
    println("Date/Time: $dateTime")
    println("Distance from Earth: $distance light years")
    
    val (name2, description2, dateTime2, distance2) = alphaCentauri
    println("\n---Using Destructuring---")
    println("Name: $name2")
    println("Description: $description2")
    println("Date/Time: $dateTime2")
    println("Distance from Earth: $distance2 light years")
}