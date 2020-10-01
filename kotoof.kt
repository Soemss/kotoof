
val name = "Soems"
var greeting: String? = null

fun main() {
    greeting = "hey"
    when (greeting) {
        null -> println("hallo")
        else -> println(greeting)
    }
    println(name)
}
