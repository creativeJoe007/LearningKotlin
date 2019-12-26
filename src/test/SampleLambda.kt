package test
import test.Player;

fun main() {
    fun downloadData(url: String, formatData: (Player) -> Boolean) {
        // handle data download here
        val player: Player = Player("Joseph", 10, "male");
        println(formatData(player));
    }

    downloadData("fakeurl.com") {
        println("Name: ${it.name}");
        println("Age: ${it.age}");
        println("Gender: ${it.gender}");
        println("Attack Mode: ${it.attack()}");
        println("Defend Mode: ${it.defend()}");
        return@downloadData true;
    };
}