package lab4_K_Cycles

fun main() {
    var sum = 0
    var i = 5

    while (i <= 57) {
        if (i != 34 && i != 46 && i != 52) {
            sum += i
        }
        i++
    }

    println("Сумма чисел от 5 до 57, исключая 34, 46 и 52: $sum")
}

/*
fun main() {
    val excludedNumbers = listOf(34, 46, 52)

    val sum = (5..57)
        .filter { !excludedNumbers.contains(it) }
        .sum()

    println("Сумма чисел от 5 до 57, исключая 34, 46 и 52: $sum")
}
 */
