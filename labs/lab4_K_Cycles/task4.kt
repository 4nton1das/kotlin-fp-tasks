package lab4_K_Cycles

fun main() {
    print("Введите число: ")
    val numberString = readlnOrNull()

    if (numberString != null) {
        var evenCount = 0
        var oddCount = 0

        for (char in numberString) {
            if (char.isDigit()) {
                val digit = char.toString().toInt()

                if (digit % 2 == 0) {
                    evenCount++
                } else {
                    oddCount++
                }
            } else {
                println("Введены некорректные символы. Введите только цифры.")
                return
            }
        }

        println("Четных цифр: $evenCount")
        println("Нечетных цифр: $oddCount")
    } else {
        println("Ввод не был произведен.")
    }
}
