import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val boxOne = intArrayOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
    boxOne.sort()
    val boxTwo = intArrayOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
    boxTwo.sort()
//    小さい順に並べ替える　sort


    var widthOne = boxOne[0]
    var heightOne = boxOne[1]
    var depthOne = boxOne[2]

    var widthTwo = boxTwo[0]
    var heightTwo = boxTwo[1]
    var depthTwo = boxTwo[2]

    var boxOneWin = widthOne >= widthTwo && heightOne >= heightTwo && depthOne >= depthTwo
    var boxTwoWin = widthOne <= widthTwo && heightOne <= heightTwo && depthOne <= depthTwo

// Round A-1
    when {
        boxOne.contentEquals(boxTwo) -> println("Box 1 = Box 2")
        boxOneWin -> println("Box 1 > Box 2")
        boxTwoWin -> println("Box 1 < Box 2")
        else -> println("Incomparable")
        }
}

