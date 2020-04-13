import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val number1 = scanner.nextLong()
    val operation = scanner.next()
    val number2 = scanner.nextLong()

    if (number2.toInt() == 0) {
        println("Division by 0!")
        return
    }

    val result = when (operation) {
        "+" -> number1 + number2
        "-" -> number1 - number2
        "/" -> number1 / number2
        "*" -> number1 * number2
        else -> "Unknown operator"
    }

    println(result)
}