package lab4_K_Cycles

fun main() {
    var sum = 0

    for (i in 4..100 step 4) {
        sum += i
    }

    println("Сумма чисел от 1 до 100, кратных 4: $sum")
}
