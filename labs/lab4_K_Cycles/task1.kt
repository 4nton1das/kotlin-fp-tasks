package lab4_K_Cycles

fun main() {
    (1..5).forEach { i ->
        println((1..i).joinToString("") { i.toString() })
    }
}

/*
fun main() {
    for (i in 1..5) {
        for (j in 1..i) {
            print(i)
        }
        println()
    }
}
 */
