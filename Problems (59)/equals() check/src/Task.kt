import java.util.Scanner

data class Client(val name: String, val age: Int, val balance: Int)

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    //implement your code here
    val client1 = Client(input.next(), input.nextInt(), input.nextInt())
    val client2 = client1.copy(name = input.next(), age = input.nextInt())
    println(client1.equals(client2))


}