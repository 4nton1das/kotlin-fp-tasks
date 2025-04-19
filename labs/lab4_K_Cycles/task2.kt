package lab4_K_Cycles

import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 10)

    while (true) {
        print("Угадайте число от 1 до 9: ")
        val guess = readlnOrNull()?.toIntOrNull()

        if (guess != null) {
            if (guess == randomNumber) {
                println("Поздравляю! Вы угадали число $randomNumber")
                break
            } else {
                println("Не угадали. Попробуйте еще раз.")
            }
        } else {
            println("Некорректный ввод. Пожалуйста, введите целое число.")
        }
    }
}
