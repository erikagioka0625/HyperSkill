import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val number = scanner.nextInt()
    val divisors = arrayOf(2,3,5,6)
    var i = 0
    while(3 >= i){
        if(number % divisors[i] == 0){
            println("Divided by ${divisors[i]}")
        }
            i++
    }
}