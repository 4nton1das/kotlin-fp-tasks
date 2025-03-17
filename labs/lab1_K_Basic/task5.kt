package lab1_K_Basic

fun main() {
    print("Введите число: ")
    val input = readln().toInt()
    val result = input.toString() + (input * 2).toString()
    println("Получаем: $result")
}
