import java.util.*

data class Box(val height: Int, val width: Int) {
    var length: Int = 0
}

fun main() {
    val input = Scanner(System.`in`)
    val box = Box(input.nextInt(), input.nextInt())
    val result = box.copy(width = input.nextInt())
    println(result)
}



