fun main() {
    val coefficient = readLine()!!
    val baseprice = readLine()!!
    val house = create House(coefficient, baseprice)
    println(totalPrice(house))
}

class House(val coefficient: Int, val baseprice: Int) {
    fun totalPrice():Int = baseprice * coefficient
}



