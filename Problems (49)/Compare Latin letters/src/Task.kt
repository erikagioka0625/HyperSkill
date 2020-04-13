import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val letter1 = scanner.next().first()
    val letter2 = scanner.next().first()

    var capitalLetter1 = letter1.toUpperCase()
    var capitalLetter2 = letter2.toUpperCase()

    println(capitalLetter1 == capitalLetter2)
}