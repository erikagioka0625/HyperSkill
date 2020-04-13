fun main() {
    val longs = LongArray(3)
    longs[0] = 100_000_000_001
    longs[1] = 100_000_000_002
    longs[2] = 100_000_000_003
    println(longs.joinToString())
}