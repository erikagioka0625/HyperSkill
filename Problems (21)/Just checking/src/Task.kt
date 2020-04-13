import java.util.*
import kotlin.math.abs
import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val size = scanner.nextInt()
    val numbers = IntArray(size)

    for (i in numbers.indices) {
        numbers[i] = scanner.nextInt()
    }

    val n = scanner.nextInt()
    val m = scanner.nextInt()
    var result = "NO"

    for (i in numbers.indices) {
        if( numbers[i] == n && numbers[i + 1] == m || numbers[i] == m && numbers[i + 1] == n ) {
            result = "YES"
            break
        }
    }

    println(result)
}
