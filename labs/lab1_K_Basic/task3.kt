package lab1_K_Basic

fun main() {
    print("Введите четырехзначное число: ")
    val input = readln()

    // println("Тип input: ${input::class.simpleName}")

    if (input.length == 4 && input.all { it.isDigit() }) {
        val digits = input.toList() // Преобразуем строку в список символов

        /*
        val digits = input.map { it.toString().toInt() }

        println("digits: $digits, type: ${digits::class.simpleName}")
        digits.forEachIndexed { index, element ->
            println("Элемент digits[$index]: $element, type: ${element::class.simpleName}")
        }
        */

        println("Результат: ${digits.joinToString(", ")}")
    } else {
        println("Некорректный ввод. Пожалуйста, введите четырехзначное число.")
    }
}
