package lab3_K_Conditions

fun main() {
    print("Введите ваш возраст: ")
    val age = readlnOrNull()?.toIntOrNull()

    if (age != null) {
        val message = getAgeMessage(age)
        println(message)
    } else {
        println("Некорректный ввод. Пожалуйста, введите целое число.")
    }
}

fun getAgeMessage(age: Int): String {
    return when {
        age > 18 -> "Вам уже все можно"
        age == 18 -> "Ура, Вам 18 лет!"
        else -> "Вы еще слишком молоды"
    }
}
