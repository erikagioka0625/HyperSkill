import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var account = scanner.nextInt()
    val payments = scanner.nextLine().split(" ").map{ it.toInt() }
    for (pay in payments) {
        when {
            account >= pay -> {
                account -= pay
                println("Thank you for choosing us to manage your account! You have $account money.")
            }
            account == pay -> {
                println("Thank you for choosing us to manage your account! You have 0 money.")
            }
            else -> {
                println("Error, insufficient funds for the purchase. You have $account, but you need $pay")
            }
        }
    }


//    var charge = scanner.nextLine().toInt()
//    var sequence = scanner.nextLine()
//    var payments = sequence.split(" ").map { it.toInt() }
//
//    var stop = 0
//    var lackSum = 0
//    var last = payments.lastIndex
//    var i = 0
//
////    全額払ったときに、予算内かどうかで分ける
////    予算内のとき
//    if ( charge - payments.sum() >= 0 ){
//        charge -= payments.sum()
////        予算内にならないときで、かつ初回の支払いから足りないとき
//    } else if( charge - payments[0] < 0) {
//        charge
//        stop = -1
//        for (i in stop+1..last) {
//            lackSum += payments[i]
//        }
////        予算内にならないときで、かつ初回の支払いは足りるとき
//    } else {
//        while ( charge > 0 && i < last) {
//            charge -= payments[i]
//            stop = i
//            i++
//        }
//
//        for (i in stop+1..last) {
//            lackSum += payments[i]
//        }
//    }
//
//
//    val result = when {
//        lackSum == 0 -> "Thank you for choosing us to manage your account! You have $charge money."
//        else -> "Error, insufficient funds for the purchase. You have ${charge}, but you need ${lackSum}."
//    }
//
//    println(result)
}
