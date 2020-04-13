import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here

    val numberOfCompany = scanner.nextInt()
    val companies = IntArray(numberOfCompany)
    val taxPercentage = IntArray(numberOfCompany)

//    会社を配列に入れる
    for (i in companies.indices) {
        companies[i] = scanner.nextInt()
    }
//　税率を配列に入れる
    for (i in companies.indices) {
        taxPercentage[i] = scanner.nextInt()
    }
//  各社の支払額の配列を用意して、計算した結果を入れる
    val payments = IntArray(numberOfCompany)
    for (i in payments.indices) {
        payments[i] = companies[i] * taxPercentage[i]
    }

//    各社の支払額の中で、最大の会社のindex+1を出力する
    val maxPayment = payments.max()
    println(maxPayment?.let { payments.indexOf(it) + 1})
}