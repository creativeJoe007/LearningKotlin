fun main() {
    val imperials = listOf("Test", "Jabber", "Talking")
    println(imperials)
    println(imperials.sorted())
    println(imperials[0])
    println(imperials.last())
    println(imperials.contains("Jabber"))

    val rebels = arrayListOf<String>()

    rebels.add("Luke")
    rebels.add("Han Solo")
    rebels.add("Jabber")
    rebels.add(0, "Tanny")

    println(rebels.size)
    println(rebels)
    println(rebels.indexOf("Tanny"))

    rebels.remove("Jabber")
    println(rebels)
    rebels.removeAt(1)
    println(rebels)


    // Maps
    // immutable
    val rebelVehiclesMap = mapOf("Solo" to "Milenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Lukes", "Range rover"))
    println(rebelVehiclesMap.keys)

    val rebelVechicles = hashMapOf("Solo" to "Milenium Falcon", "Luke" to "Landspeeder", "Jack" to "Rangi")
    rebelVechicles["Solo"] = "Venza"
    println(rebelVechicles)
    rebelVechicles.put("Leiah", "Tantive IV")
    println(rebelVechicles)
    rebelVechicles.remove("Leiah")
    println(rebelVechicles)
    println(rebelVechicles.isEmpty())
}