import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here

    var charge = scanner.nextLine().toInt()
    var sequence = scanner.nextLine()
    var payments = sequence.split(" ")
    var stop = 0
    var lackSum = 0
    println(charge)
    println(payments)

//    chargeがマイナスになるまで、引いていく
    do {
        for(i in 0..payments.lastIndex) {
            charge -= payments[i].toInt()
            stop = i
        }
    } while ( charge > 0)

    for (i in stop..payments.lastIndex) {
        lackSum += payments[i].toInt()
    }

    val result = when {
        charge == 0 -> "Thank you for choosing us to manage your account! You have 0 money."
        charge > 0 -> "Thank you for choosing us to manage your account! You have $charge money."
        else -> "Error, insufficient funds for the purchase. You have ${charge+payments[stop].toInt()}, but you need ${lackSum}."
    }

    println(result)

//
//
//
//    when {
//        charge == 0 -> println("Thank you for choosing us to manage your account! You have 0 money. \n" +
//                "\n")
//        charge > 0 -> println("Thank you for choosing us to manage your account! You have $charge money. ")
//        else -> println("Error, insufficient funds for the purchase. You have $charge, but you need $nextPay. \n")
//    }

}