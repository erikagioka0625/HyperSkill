import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var beFixed = 0
    var beRejected = 0
    var beReady = 0
    repeat(n) {
        when (scanner.nextInt()) {
            1 -> beFixed++
            -1 -> beRejected++
            0 -> beReady++
        }
    }

    println("$beReady $beFixed $beRejected")

}