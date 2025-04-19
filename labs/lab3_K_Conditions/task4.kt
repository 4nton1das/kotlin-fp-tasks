package lab3_K_Conditions

fun main() {
    print("Введите число от 1 до 7: ")
    val dayNumber = readlnOrNull()?.toIntOrNull()

    if (dayNumber != null) {
        val dayOfWeek = when (dayNumber) {
            1 -> "Понедельник"
            2 -> "Вторник"
            3 -> "Среда"
            4 -> "Четверг"
            5 -> "Пятница"
            6 -> "Суббота"
            7 -> "Воскресенье"
            else -> "Некорректный ввод. Введите число от 1 до 7."
        }
        println(dayOfWeek)
    } else {
        println("Некорректный ввод. Пожалуйста, введите целое число.")
    }
}
