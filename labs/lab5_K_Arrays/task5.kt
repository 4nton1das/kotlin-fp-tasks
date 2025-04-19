package lab5_K_Arrays

fun main() {
    val numbers = mutableListOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)

    numbers.sort()

    println("Отсортированный массив: ${numbers.joinToString(", ")}")
}
