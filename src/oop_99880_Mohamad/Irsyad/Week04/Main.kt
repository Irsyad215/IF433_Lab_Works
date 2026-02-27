package oop_99880_Mohamad.Irsyad.Week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val myEv = ElectricCar("Tesla", 4, 95)
    myEv.accelerate()
    myEv.honk()
    myEv.openTrunk()

    println("\n--- Testing Employee Hierarchy ---")
    val mgr = Manager("Alice", 10000000)
    val dev = Developer("Bob", 8000000, "Kotlin")

    mgr.work()
    println("Bonus Manager: ${mgr.calculateBonus()}")

    dev.work()
    println("Bonus Developer: ${dev.calculateBonus()}")
}