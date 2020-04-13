import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val result = BooleanArray(4)
    for(ch in 0..3){
        result[ch] = scanner.next().first().isDigit()
    }
    print(result.joinToString(separator = '\\'.toString()))

}