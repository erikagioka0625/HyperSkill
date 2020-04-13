import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val durationDays = scanner.nextInt()
    val foodCostPerDay = scanner.nextInt()
    val flightCost = scanner.nextInt()*2
    val hotelCost = scanner.nextInt()

    println(durationDays*foodCostPerDay+flightCost+(durationDays-1)*hotelCost)
}