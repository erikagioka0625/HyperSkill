fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = House(rooms, price)
    println(house.totalPrice())
}

class House(val rooms: Int, val price: Int) {
    val coefficient = when {
        price < 0 -> 0.0
        rooms <= 1 -> 1.0
        rooms in 2..3 -> 1.2
        rooms == 4 -> 1.25
        rooms in 5..7 -> 1.4
        else -> 1.6
    }
    fun totalPrice() = (price * coefficient).toInt()
}