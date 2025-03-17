package lab1_K_Basic

fun main() {
    val totalDays = 2642
    val years = totalDays / 365
    val weeks = (totalDays % 365) / 7
    val days = (totalDays % 365) % 7

    println("Дней: $totalDays")
    println("Лет: $years, недель: $weeks, дней: $days")
}
