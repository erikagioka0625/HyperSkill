import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    val numbers = IntArray(n)
    for (i in 1..n) {
        numbers[i-1] = scanner.nextInt()
    }

    var m = scanner.nextInt()
    var result = "NO"

    for(num in numbers) {
        if (m == num) {
            result = "YES"
            break
        } else {
            result = "NO"
        }
    }

    print(result)
}