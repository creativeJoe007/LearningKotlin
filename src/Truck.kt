package learnKotlin

import learnKotlin.Vehicle;

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    fun tow() {
        println("Taking the horses to the rodeo")
    }
    fun details() {
        println("Make: $make\n Mode: $model\n TowingCapacity: $towingCapacity")
    }
}