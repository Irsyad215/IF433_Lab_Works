package oop_99880_mohamad_irsyad.week02 // [cite: 8]

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`) //

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine() //

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next() //

    scanner.nextLine() // Clear the buffer

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!") //
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine() // Fixed capital 'L'

        // Instansiasi Objek
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.") //
    }
}