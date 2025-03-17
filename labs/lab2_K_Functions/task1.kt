package lab2_K_Functions

fun roundNumber(number: Int): String {
    return when {
        number < 1000 -> number.toString()
        number in 1000..9999 -> {
            "${number / 1000}K"
        }
        else -> "Число слишком большое"
    }
}

fun main() {
    println(roundNumber(1272))
    println(roundNumber(543))
    println(roundNumber(8765))
    println(roundNumber(10000))
}
