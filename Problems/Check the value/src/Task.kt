import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val result = ( num < 10 ) && ( num > 0 )
    println(result)
}