package lab5_K_Arrays

fun main() {
    val numbers = listOf(5, 8, 18, 34, 3, 56, 43, 27, 4, 23)

    val average = numbers.average()

    println("Среднее арифметическое: $average")

    val aboveAverage = numbers.filter { it > average }

    println("Элементы больше среднего арифметического: ${aboveAverage.joinToString(", ")}")
}
