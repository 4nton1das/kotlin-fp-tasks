package lab4_K_Cycles

import kotlin.math.sqrt

fun main() {
    print("Введите число: ")
    val number = readlnOrNull()?.toIntOrNull()

    if (number != null) {
        if (number <= 0) {
            println("Пожалуйста, введите положительное число.")
        } else {
            val divisors = mutableSetOf(1, number) // Используем Set, чтобы избежать дубликатов
            // var iterations = 0
            val sqrtNumber = sqrt(number.toDouble()).toInt()
            // println("Целая часть корня числа $number: $sqrtNumber")
            for (i in 2..sqrtNumber) {
                // iterations++
                if (number % i == 0) {
                    divisors.add(i)
                    divisors.add(number / i)
                }
            }

            println("Делители числа $number: ${divisors.sorted().joinToString(", ")}")
            // println("Количество итераций: $iterations")
        }
    } else {
        println("Некорректный ввод. Пожалуйста, введите целое число.")
    }
}
