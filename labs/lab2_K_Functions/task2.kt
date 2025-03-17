package lab2_K_Functions

fun getYearEnding(years: Int): String {
    return when {
        years % 100 in 11..19 -> "$years лет"
        years % 10 == 1 -> "$years год"
        years % 10 in 2..4 -> "$years года"
        else -> "$years лет"
    }
}

fun main() {
    println(getYearEnding(1))   // Вывод: 1 год
    println(getYearEnding(2))   // Вывод: 2 года
    println(getYearEnding(5))   // Вывод: 5 лет
    println(getYearEnding(10))   // Вывод: 10 лет
    println(getYearEnding(11))  // Вывод: 11 лет
    println(getYearEnding(21))  // Вывод: 21 год
    println(getYearEnding(22))  // Вывод: 22 года
    println(getYearEnding(25))  // Вывод: 25 лет
    println(getYearEnding(101)) // Вывод: 101 год
    println(getYearEnding(104)) // Вывод: 104 года
    println(getYearEnding(105)) // Вывод: 105 лет
    println(getYearEnding(112)) // Вывод: 112 лет
}
