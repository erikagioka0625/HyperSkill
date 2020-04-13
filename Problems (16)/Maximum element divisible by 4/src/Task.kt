import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()
    val elements = IntArray(number)
    var i = 0
    repeat(number) {
        var element = scanner.nextInt()
        elements[i] = element
        i++
    }
    elements.sort()

    i = 0
    var maxDivided = elements[0]
    repeat(number) {
        if (elements[i] % 4 == 0) {
            maxDivided = elements[i]
        } else {
            maxDivided
        }
        i++
    }
    println(maxDivided)
}