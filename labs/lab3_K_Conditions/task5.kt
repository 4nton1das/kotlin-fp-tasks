package lab3_K_Conditions

fun main() {
    print("Введите первое число: ")
    val num1 = readlnOrNull()?.toIntOrNull() ?: 0

    print("Введите второе число: ")
    val num2 = readlnOrNull()?.toIntOrNull() ?: 0

    print("Введите третье число: ")
    val num3 = readlnOrNull()?.toIntOrNull() ?: 0

    if (num1 == num2 || num1 == num3 || num2 == num3) {
        println("Ошибка")
    } else {
        val average = listOf(num1, num2, num3).sorted()[1]
        println("Среднее число: $average")
    }
}
