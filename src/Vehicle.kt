package learnKotlin

open class Vehicle(val make: String, val model: String) {
    open fun accelerate() {
        println("vroom vroom");
    }
    fun park() {
        println("parking the vehicle");
    }
    fun brake() {
        println("STOP!!!!");
    }
}