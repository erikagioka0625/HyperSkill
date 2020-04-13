import java.util.*

data class Box(var height: Int, var width: Int) {
    var length: Int = 0
}

fun main() {
    val input = Scanner(System.`in`)
    val box = Box(0,0)
    box.height = input.nextInt()
    box.length = input.nextInt()
    box.width = input.nextInt()
    println(box)

}