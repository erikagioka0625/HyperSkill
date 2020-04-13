import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    if (num % 2 === 0) println(num + 2) else println(num + 1)
}