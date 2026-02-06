package oop_99880_Mohamad.Irsyad.Rendyka_Week01

fun main () {
    var name =  "john thor"
    var score = 80

    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 90..89 -> "B"
        in 90..79 -> "C"
        else -> "D"
    }
    println("grade kamu: $grade")
}