package oop_99880_Mohamad.Irsyad.Week08

import oop_99880_Mohamad.Irsyad.Week06.Smartphone

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.adress?.city?.name ?: "kota tidak diketahui"
    println("Tujuan pengiriman : $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalprice?.let { price ->
        val tax = price * 0.11
        "transaksi Valid. harga: Rp$price, Pajak: Rp$tax "
    } ?: "Transaksi Invalid: Harga belom di-set!"

    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text = item as? String

        text?.let {
            println("Ditemukan Teks: ${it.uppercase()}")
        }
    }
}