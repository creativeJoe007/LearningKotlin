package test

import test.Player;

class Thief(name: String, age: Int, gender: String, val gang: String) : Player(name, age, gender) {
    fun gangName() {
        println("$name Belongs to a gang called $gang");
    }
}

class Warrior(name: String, age: Int, gender: String, val clan: String) : Player(name, age, gender) {
    fun clanName() {
        println("$name Belongs to a clan called $clan");
    }
}

fun main() {
    var ahmed: Thief = Thief("Ahmed", 15, "male", "Killo");
    var joe: Warrior = Warrior("Joseph", 22, "male", "Seeker");

    ahmed.gangName();
    joe.clanName();
    ahmed.walk();
    joe.walk();
    ahmed.attack();
    joe.defend();
    joe.attack();
    ahmed.defend();
}