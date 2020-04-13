package parking

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var text = scanner.nextLine()
    var inputs = text.split(" ")
    var isCreated = false
    var locationStatus = mutableListOf<Int>()
    var modelReg = mutableListOf<String>()
    var colorReg = mutableListOf<String>()


    do {
        if (inputs[0] == "create") {
            isCreated = true
            locationStatus = MutableList(inputs[1].toInt()) { 0 }
            modelReg = MutableList(inputs[1].toInt()) { "_" }
            colorReg = MutableList(inputs[1].toInt()) { "_" }
            println("Created a parking lot with ${inputs[1]} spots.")
        } else {
            when (inputs[0]) {
                "park" -> park(isCreated, locationStatus, modelReg, colorReg, inputs[1], inputs[2].toUpperCase())
                "leave" -> leave(isCreated, locationStatus, modelReg, colorReg, inputs[1])
                "status" -> status(isCreated, locationStatus, modelReg, colorReg)
                "spot_by_color" -> spotByColor(isCreated, locationStatus, modelReg, colorReg, inputs[1].toUpperCase())
                "spot_by_reg" -> spotByReg(isCreated, locationStatus, modelReg, colorReg, inputs[1])
                "reg_by_color" -> regByColor(isCreated, locationStatus, modelReg, colorReg, inputs[1].toUpperCase())
                "exit" -> return
            }
        }

        text = scanner.nextLine()
        inputs = text.split(" ")

    } while (inputs[0] != "exit")

}




fun park(isCreated: Boolean, locationStatus: MutableList<Int>, modelReg: MutableList<String>, colorReg: MutableList<String>, model: String, color: String) {

    if (!isCreated) {
        println("Sorry, parking lot is not created.")
        return
    }

    var location = 1
    var fullState = false

    for(state in locationStatus) {
        if(state == 0) {
            location = locationStatus.indexOf(state)
            locationStatus[location] = 1
            modelReg[location] = model
            colorReg[location] = color
            fullState = false
            break
        } else {
            fullState = true
        }
    }

    println(when (fullState) {
        true -> "Sorry, parking lot is full."
        false -> "${colorReg[location]} car parked on the spot ${location+1}."
    })
}

fun leave(isCreated: Boolean, locationStatus: MutableList<Int>, modelReg: MutableList<String>, colorReg: MutableList<String>, locationNumber: String) {
    if (!isCreated) {
        println("Sorry, parking lot is not created.")
        return
    }
    println("Spot $locationNumber is free.")
    locationStatus[locationNumber.toInt() - 1] = 0
    modelReg[locationNumber.toInt() - 1] = "_"
    colorReg[locationNumber.toInt() - 1] = "_"


}

fun status(isCreated: Boolean, locationStatus: MutableList<Int>, modelReg: MutableList<String>, colorReg: MutableList<String>) {

    if (!isCreated) {
        println("Sorry, parking lot is not created.")
        return
    }
    if (!locationStatus.contains(1)) {
        println("Parking lot is empty.")
    } else {
        for (i in locationStatus.indices) {
            if (locationStatus[i] == 1) {
                println("${i+1} ${modelReg[i]} ${colorReg[i]}")
            }
        }
    }
}

fun spotByColor(isCreated: Boolean, locationStatus: MutableList<Int>, modelReg: MutableList<String>, colorReg: MutableList<String>, color: String) {
    if (!isCreated) {
        println("Sorry, parking lot is not created.")
        return
    }

    if(!colorReg.contains(color)) {
        println("No cars with color ${color} were found.")
    } else {
        val result = mutableListOf<Int>()
        for ((index, colorData) in colorReg.withIndex()) {
            if (colorData == color) result.add(index + 1)
        }

        println(result.joinToString(", "))
    }
}

fun spotByReg(isCreated: Boolean, locationStatus: MutableList<Int>, modelReg: MutableList<String>, colorReg: MutableList<String>, model: String) {
    if (!isCreated) {
        println("Sorry, parking lot is not created.")
        return
    }
    if(!modelReg.contains(model)) {
        println("No cars with registration number $model were found.")
    } else {
        val result = mutableListOf<Int>()
        for ((index, modelData) in modelReg.withIndex()) {
            if (modelData == model) result.add(index + 1)
        }

        println(result.joinToString(", "))
    }
}

fun regByColor(isCreated: Boolean, locationStatus: MutableList<Int>, modelReg: MutableList<String>, colorReg: MutableList<String>, color: String) {
    if (!isCreated) {
        println("Sorry, parking lot is not created.")
        return
    }
    if(!colorReg.contains(color)) {
        println("No cars with color ${color} were found.")

    } else {

        val result = mutableListOf<Int>()
        for ((index, colorData) in colorReg.withIndex()) {
            if (colorData == color) result.add(index)
        }

        val result2 = mutableListOf<String>()
        for (i in result) {
            result2.add(modelReg[i])
        }
        println(result2.joinToString(", "))
    }
}


