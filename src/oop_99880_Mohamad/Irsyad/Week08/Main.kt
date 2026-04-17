package oop_99880_Mohamad.Irsyad.Week08

fun Main {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null ,null)

    val destination = emptyOrder,deliveryDetails?.adress?,city?, name ?: "kota tidak diketahui"
    println("Tujuan pengiriman : $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalprice?,let { price ->
        val tax = price * 0.11
        "transaksi Valid. harga: Rp$price, Pajak: Rp$tax "
    } ?: "Transaksi Invalid: Harga belom di-set!"

    println(receipt)
}