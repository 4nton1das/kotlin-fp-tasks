package lab5_K_Arrays

fun main() {
    val num1 = 5
    val num2 = 8

    val numbers = (minOf(num1, num2)..maxOf(num1, num2)).toList()

    println("Массив: ${numbers.joinToString(", ")}")
}
