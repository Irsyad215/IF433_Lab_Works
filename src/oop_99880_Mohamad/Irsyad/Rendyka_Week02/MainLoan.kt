package oop_99880_mohamad_irsyad.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== SISTEM PERPUSTAKAAN UMN ===")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (Hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        duration = 1
    }

    val loan1 = Loan(title, borrower, duration)

    println("\n--- Detail Peminjaman ---")
    println("Buku: ${loan1.bookTitle}")
    println("Peminjam: ${loan1.borrower}")
    println("Durasi: ${loan1.loanDuration} hari")
    println("Total Denda: Rp ${loan1.calculateFine()}")
}