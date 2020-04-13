import java.util.*

data class Box(val height: Int, val length: Int, val width: Int) {
    override fun toString(): String {
        return "Box(height=$height, width=$width)"
    }
}

fun main() {
    val input = Scanner(System.`in`)
    val box = Box(input.nextInt(), input.nextInt(), input.nextInt())
    println(box)
}