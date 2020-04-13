import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()

    var result = input.groupingBy { it }.eachCount()
    println(result.filterValues { it == 1 }.size)

}
