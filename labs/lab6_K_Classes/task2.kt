package lab6_K_Classes

class Message(private val username: String) {
    fun introduce() {
        println("Привет, меня зовут $username")
    }
}

fun main() {
    val firstMessage = Message("Anton")
    firstMessage.introduce()

    val secondMessage = Message("Pavel")
    secondMessage.introduce()

    Message("Alice").introduce()
}
