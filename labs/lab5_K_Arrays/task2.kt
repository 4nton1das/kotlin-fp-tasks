package lab5_K_Arrays

fun main() {
    val numbers = mutableListOf<Int>()

    numbers.addAll(listOf(8, 21, 5, 90, 11, 0))
    numbers.add(0, 90)
    numbers.removeAt(4)
    numbers.add(-35)

    println("Массив: ${numbers.joinToString(", ")}")
}
