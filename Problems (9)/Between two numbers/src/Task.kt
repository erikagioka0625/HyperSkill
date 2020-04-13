import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val number = scanner.nextInt()
    val min = scanner.nextInt()
    val max = scanner.nextInt()

    println(number in min..max)

}