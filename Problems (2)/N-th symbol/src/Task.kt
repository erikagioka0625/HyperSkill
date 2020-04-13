import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val word = scanner.nextLine()
    val number = scanner.nextInt()

    print("Symbol # $number of the string \"$word\" is \'${word[number-1]}\'")
}
