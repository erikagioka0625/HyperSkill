import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val input = scanner.nextInt()
    println(input / 100 + input / 10  % 10  + input % 10 )
}