package lab5_K_Arrays

fun main() {
    val numbers = listOf(5, 2, 8, 1, 9, 4)

    val sortedNumbers = numbers.sorted()
    val secondSmallest = sortedNumbers.getOrNull(1)

    println("Второй самый маленький элемент: $secondSmallest")
}
