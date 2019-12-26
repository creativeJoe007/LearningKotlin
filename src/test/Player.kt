package test

open class Player(val name: String, val age: Int, val gender: String) {
    fun attack() {
        println("$name is Attacking")
    }
    fun defend() {
        println("$name is defending")
    }
    fun walk() {
        println("$name is walking")
    }
}