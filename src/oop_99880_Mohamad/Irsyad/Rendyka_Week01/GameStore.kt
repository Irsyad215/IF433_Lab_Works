package oop_99880_Mohamad.Irsyad.Rendyka_Week01

fun main() {
    val gameTittle = "Elden Ring"
    val price = 600000
    val usernote: String?= null

    val discount = calculateDiscount (price)
    val finalPrice = price - discount

    printReceipt(tittle = gameTittle, finalPrice = finalPrice, note = usernote)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(tittle: String, finalPrice: Int, note: String?) {
    println("--- Struk Pembelian ---")
    println("Game: $tittle")
    println("Harga Akhir: Rp $finalPrice")
    println("catatan: ${note ?: "Game Souls-Like open world dari FromSoftware"}")
}
