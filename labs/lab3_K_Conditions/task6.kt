package lab3_K_Conditions

fun main() {
    val profit = 345
    val losses = 750

    val tradeBalance = profit - losses

    if (tradeBalance > 0) {
        println("Ваша прибыль составила: $tradeBalance")
    } else if (tradeBalance < 0) {
        println("Ваши убытки составили: ${-tradeBalance}")
    } else {
        println("Торговый баланс равен нулю.")
    }
}
