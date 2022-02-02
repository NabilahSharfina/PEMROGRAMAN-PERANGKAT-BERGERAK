fun main() {
    val user = setUser("Aslan", 34)

    println(user)
    printUser("Aslan")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}