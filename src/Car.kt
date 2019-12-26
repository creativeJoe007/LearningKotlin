package learnKotlin

import learnKotlin.Vehicle;
//class Car(val make: String, val model: String, var color: String) {
//    fun accelerate() {
//        println("vroom vroom")
//    }
//    fun details() {
//        println("Make: $make\n Mode: $model\n Color: $color")
//    }
//}
class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate() {
        println("Ludachris mode")
    }
}