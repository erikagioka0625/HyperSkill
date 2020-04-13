import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var sum = 0

    do {
        var currentNumber = scanner.nextInt()
        sum += currentNumber
    } while (currentNumber !== 0)
    println(sum)
}