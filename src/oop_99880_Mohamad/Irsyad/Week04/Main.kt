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
    // Task 1: Instantiate ElectricCar once [cite: 74]
    val myEv = ElectricCar("Tesla", 4, 95)
    myEv.accelerate() // Should show battery capacity and no "super" logic [cite: 69, 70]
    myEv.honk()       // Inherited from Car [cite: 74]
    myEv.openTrunk()  // Inherited from Car [cite: 74]
}