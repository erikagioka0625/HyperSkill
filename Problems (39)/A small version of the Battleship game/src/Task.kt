import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val numbers = input.nextLine()

    var numbersArray = numbers.split(" ")

    var evenList = numbersArray.filterIndexed{i, _ -> i % 2 ==0 }.map{ it.toInt() }
    var oddList = numbersArray.filterIndexed{i, _ -> i % 2 !=0 }.map{ it.toInt() }

    var xArray = MutableList<Int>(5) { 0 }
    var yArray = MutableList<Int>(5) { 0 }

    for (i in 1..5) {
        xArray[i-1] = i
        yArray[i-1] = i
    }

    println(xArray.minus(evenList.map { it.toInt()}).joinToString(" "))
    println(yArray.minus(oddList.map { it.toInt()}).joinToString(" "))
    }




