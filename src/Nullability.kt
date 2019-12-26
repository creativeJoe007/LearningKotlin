fun main() {
    var name: String = "JohhnyB"
//    name = null
    var nullableName : String? = "10"
//    nullableName = null
    var length: Int = 0
    if(nullableName !== null) {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    var l = if(nullableName !== null) nullableName.length else -1
    println(l)

    // Second method Safe Call Operator
    println(nullableName?.toInt())
    // Third Method is Elvis Operator
    val len = nullableName?.length ?: -1
    var noName = nullableName ?: "No one knows meeeeeeeeee"
    println(noName)
    // !!
    println(nullableName!!.length)
}