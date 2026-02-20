package oop_99880_Mohamad.Irsyad.Week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif DI-set ke 0")
                field = 0
            } else {
                field = value
            }
        }
}

private var performanceRating: Int = 3

fun increaseperformance() {
    performanceRating++
    println("Kinerja $name meningkat Rating: $performanceRating")
}

fun printStatus() {
    prinln("karyawan: $name, Rating: $performanceRating")
}

val tax: Double
    get() = salaru * 0.