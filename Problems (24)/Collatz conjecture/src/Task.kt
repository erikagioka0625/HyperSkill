import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    var number = scanner.nextInt()
    var result = 0
    do {
        result = if (number % 2 == 0) {
            number / 2
        } else {
            number * 3 + 1
        }
        print("$number ")
        number = result
    } while (result != 1)
    println(1)

}