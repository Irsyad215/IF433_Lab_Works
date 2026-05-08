package oop_99880_Mohamad.Irsyad.Week11

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=== TEST RUN FUNCTIONS ===")
    val result = "Kotlin".run {
        println("Memproses Kata: ${this}")
        length * 2
    }
    println("Hasil Kalkulasi run: $result")
}