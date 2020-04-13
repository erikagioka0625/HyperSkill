import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()

    if (n == 1) {
        println(scanner.nextInt())
    } else {
        val numbers = IntArray(n)
        for (i in 1..n) {
            numbers[i-1] = scanner.nextInt()
        }
//        numbers.sort()
//        println(numbers[n-1] * numbers[n-2])
        var max = 0

        for (i in 0..n-2) {
            for(t in i+1 until n) {
                var result = numbers[i] * numbers[t]
                if(max < result) max = result
            }
        }
        println(max)

    }



}
