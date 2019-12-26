fun main() {
    val imperials = listOf("Test", "Jabber", "Talking")
    val rebelVechicles = hashMapOf("Solo" to "Milenium Falcon", "Luke" to "Landspeeder", "Jack" to "Rangi")

    for(imperial in imperials) {
        println("Name:  $imperial")
    }

    for((key, value) in rebelVechicles) {
        println("Key: $key \n Value: $value")
    }

    var x = 10
    while(x > 0) {
        println(x)
        x--
    }
}