package lab3_K_Conditions

fun main() {
    val num1 = 4
    val num2 = 6

    val bothEven = if (num1 % 2 == 0 && num2 % 2 == 0) true else false

    println("Обе переменные четные: $bothEven")
}
