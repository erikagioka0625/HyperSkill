import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val year = scanner.nextInt()

    println( when {
        year % 400 == 0 -> "Leap"
        year % 100 == 0 ->"Regular"
        year % 4 == 0 -> "Leap"
        else -> "Regular"
    })
}