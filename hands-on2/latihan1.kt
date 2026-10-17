open class Vehicle(val name: String, val maxSpeed: Int) {
    open fun describe(): String {
        return "$name dapat melaju hingga $maxSpeed km/h"
    }
}

class Car(name: String, val numberOfDoors: Int) : Vehicle(name, 180) {
     override fun describe(): String { 
     return ("$name dapat melaju hingga $maxSpeed km/h dan punya $numberOfDoors pintu")
     }
}

class Motorcycle(name: String, val hasSidecar: Boolean) : Vehicle(name, 220) {
     override fun describe(): String { 
     return if(hasSidecar) {
       ("$name dapat melaju hingga $maxSpeed km/h dengan sidecar")
     }else{
       ("$name dapat melaju hingga $maxSpeed km/h tanpa sidecar")
     }
   }
}

fun main() {
    val vehicles = listOf<Vehicle>(
      Car("Toyota", numberOfDoors = 4), Motorcycle("Ninja", hasSidecar = false)
    )
    vehicles.forEach { println(it.describe()) }
}
