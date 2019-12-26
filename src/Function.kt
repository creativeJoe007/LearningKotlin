fun main(args: Array<String>) {
    fun forceChoke() {
        println("You have failed me for a last time Admiral...")
    }
    forceChoke()

    fun MakeAnEntrance(line: String) {
        println(line);
    }
    MakeAnEntrance("I find your lack of faith  disturbing")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): String {
        val goodGuys =  rebels + ewoks
        return goodGuys.toString()
    }

    val rebels = calculateNumberGoodGuys(5, 10)
    println("Darth Varder faced off against $rebels rebel scum")
    println("Darth Varder faced off against ${calculateNumberGoodGuys(5, 10)} rebel scum")

    fun vaderIsFeeling(mood: String = "angry") {
        println("Varder is feeling $mood")
    }
    vaderIsFeeling()
    vaderIsFeeling("mad")

    // excersise

    val lukeReturns: String = "Hello, Varder... your end is near"
    fun lukeSays(statement: String) {
        println("Luke say's $statement")
    }
    lukeSays(lukeReturns);
}