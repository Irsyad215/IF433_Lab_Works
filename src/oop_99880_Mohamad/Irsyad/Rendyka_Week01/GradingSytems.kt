package oop_99880_Mohamad.Irsyad.Rendyka_Week01

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

fun main () {
    var name =  "john thor"
    var score = 80

    println("Nama: $name, Nilai: $score")
    val studentId: String? = null

    val idlength = studentId?.length ?: 0

    val grade = when (score) {
        in 90..100 -> "A"
        in 90..89 -> "B"
        in 90..79 -> "C"
        else -> "D"
    }
    println("grade kamu: $grade")
    println("status: ${calculateStatus(score)}")
    println("panjang ID: $idlength")
}