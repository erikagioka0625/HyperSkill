// Posted from EduTools plugin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    var number = scanner.nextInt()
    print("$number ")
    while (number != 1) {
        number = if (number % 2 == 0) {
            number / 2
        } else {
            number * 3 + 1
        }
        print("$number ")
    }
}