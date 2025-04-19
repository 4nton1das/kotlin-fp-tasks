package lab3_K_Conditions

fun main() {
    val num1 = 2
    val num2 = 6

    println("У вас есть числа: $num1 и $num2")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")

    print("Выберите операцию: ")
    val choice = readlnOrNull()?.toIntOrNull()

    if (choice != null) {
        when (choice) {
            1 -> println("$num1 + $num2 = ${num1 + num2}")
            2 -> println("$num1 - $num2 = ${num1 - num2}")
            0 -> println("Вы ничего не выбрали")
            else -> println("Некорректный ввод")
        }
    } else {
        println("Некорректный ввод")
    }
}