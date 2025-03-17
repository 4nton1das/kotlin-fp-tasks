package lab1_K_Basic

fun main() {
    print("Введите имя: ")
    val name = readln()

    print("Введите возраст: ")
    val age = readln().toInt() // Преобразуем возраст в число

    println("Привет, $name! Тебе уже $age")
}
