package oop_99880_Mohamad.Irsyad.Week03

fun main() {
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("pajak yang harus dibayar: ${e.tax})
}