import java.util.*

// write your code here

fun isRightEquation(firstNum: Int, secondNum:Int, thirdNum: Int): Boolean {
    return firstNum * secondNum == thirdNum
}


/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    println(isRightEquation(a, b, c))
}