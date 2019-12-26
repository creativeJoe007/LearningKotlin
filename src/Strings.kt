fun main(args: Array<String>) {
    var str = "May the force be with you"
    println(str)
    var str1 = "My dad said the funniest thing he said is \"A Joke \""
    println(str1)
    val rawString = """|HEllo ftrguutjurtr
    |I have a new boy
    |trgtrgrr
    """.trimMargin()
    println(rawString)

//    for (char in str) {
//        println(char)
//    }
    val contentEquals = str.contentEquals("May the force be with you")
    val contains = str.contains("forces", true)
    println(contentEquals)
    println(contains)

    val lowwer = str.toLowerCase()
    val upper = str.toUpperCase()
    println(lowwer)
    println(upper)

    var num: Int = 5
    println(num.toString())

    val subsequence = str.subSequence(4,13)
    println(subsequence)

    val luke = "Luke Skywalker"
    val color = "green"
    var vehicle = "LandSpeeder"
    val age = 27

    println("$luke has a $color lightsaber and drives a $vehicle and is $age years old")
    println("lukes full name ${luke.toUpperCase()} has ${luke.length} characters")

}