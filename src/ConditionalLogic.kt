fun main(args: Array<String>) {
    val a = 2
    val b = 2

    if (a === b) {
        println("Same same")
    }
    else {
        println("Not same")
    }

    val accountBalance = 100
    val price = 50

    if(accountBalance >= price) {
        println("Yay!!! you can buy this")
    }
    else {
        println("Nahh!!!! you are too broke")
    }

    val degrees = 60

    if(degrees >= 70) {
        println("This is some nice weather")
    } else if(degrees < 70 && degrees >= 50) {
        println("Grab a sweater")
    } else {
        println("Holy crap, it's cold")
    }

    val isHungry = false
    val isBored = true

    if(isHungry || isBored) {
        println("Lets go get pizza")
    }

    val x = 1
    when (x) {
        1 -> {
            println("X is 1")
        }
        2 -> println("X is 2")
        else -> println("X is not equal 1 or 2")
    }

    fun varderIsFeeling(mood: String = "angry") {
        if(mood == "angry") println("Varder is $mood")
        else if(mood == "happy") println("YOO....Varder is $mood")
        else println("Whatever you do, dont make him angry")
    }
    varderIsFeeling()
    varderIsFeeling("happy")
}