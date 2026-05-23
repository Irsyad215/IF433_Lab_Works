package oop_99880_Mohamad.Irsyad.Week13

import java.io.File

fun main() {
    val file = File("notes.txt")

    println("=== TEST WRITE TEXT ===")
    file.writeText("Line 1: Inisialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis.")
}