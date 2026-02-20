package oop_99880_Mohamad.Irsyad.Week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif. DI-set ke 0")
                field = 0
            } else {
                field = value
            }
        }

    // These must be INSIDE the class
    private var performanceRating: Int = 3

    fun increasePerformance() { // Fixed capitalization to match main()
        performanceRating++
        println("Kinerja $name meningkat. Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }

    val tax: Double
        get() = salary * 0.1 // Assuming 10% tax
}