import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val character = scanner.next().first()
    println(when {
        character.isUpperCase() -> "true"
        character in '1'..'9'  -> "true"
        else -> "false"
    })
}



