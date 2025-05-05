open class Animal(
    open val food: String,
    open val location: String
) {
    open fun makeNoise() {
        println("Животное издает звук")
    }

    open fun eat() {
        println("Животное ест $food")
    }

    fun sleep() {
        println("Животное спит")
    }
}

class Dog(
    food: String,
    location: String,
    val breed: String
) : Animal(food, location) {

    override fun makeNoise() {
        println("Собака лает: Гав-гав!")
    }

    override fun eat() {
        println("Собака ест $food")
    }
}

class Cat(
    food: String,
    location: String,
    val lives: Int
) : Animal(food, location) {

    override fun makeNoise() {
        println("Кошка мяукает: Мяу!")
    }

    override fun eat() {
        println("Кошка ест $food")
    }
}

class Horse(
    food: String,
    location: String,
    val maxSpeed: Double
) : Animal(food, location) {

    override fun makeNoise() {
        println("Лошадь ржет: И-го-го!")
    }

    override fun eat() {
        println("Лошадь жует $food")
    }
}

class Veterinarian {
    fun treatAnimal(animal: Animal) {
        println("Тип: ${animal::class.simpleName}, Еда: ${animal.food}, Место: ${animal.location}")
    }
}

fun main() {
    val animals = arrayOf(
        Dog("кости", "будка", "овчарка"),
        Cat("рыба", "дом", 9),
        Horse("сено", "поле", 60.5)
    )

    val vet = Veterinarian()

    for (animal in animals) {
        vet.treatAnimal(animal)
    }
}
