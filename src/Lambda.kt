package learnKotlin

import learnKotlin.Car;
fun main() {
    val printMessage = {message: String -> println(message)}
    printMessage("Helllooo World")
    val findSum = {a: Int, b: Int -> a + b}
    println(findSum(5,10))

    // another way of declaring lambda
    val findNewSum: (Int, Int) -> Int = {x,y -> x + y}
    println(findNewSum(2,3))
    fun downloadData(url: String, completion: () -> Unit) {
        // sent a download request
        // we got back data
        // no network errors
        completion()
    }

    downloadData("stockfare.co", {
        println("This code block would only run after the completion")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        // download something from the internet here
        val car: Car = Car("tesla", "X-class", "red");
        completion(car);
    }

    downloadCarData("fakeurl.com") {
        println(it.color)
        println(it.make)
        println(it.model)
    }

    downloadCarData("fakeurl.com") {car ->
        println(car.color)
        println(car.make)
        println(car.model)
    }

    fun downnloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        val webRequestSucess = false;
        if(webRequestSucess) {
            val truck = Truck("Ford", "F-150", 10000)
            completion(truck, true)
        }
        else {
            completion(null, false);
        }
    }

    downnloadTruckData("fakeurl.com") {truck, success ->
        if(success === true) {
            // do something with our trucks
            truck?.tow();
        }
        else {
            // handle web request failure
            println("Something went wrong")
        }
    }
}