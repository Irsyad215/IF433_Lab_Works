package oop_99880_Mohamad.Irsyad.Rendyka_Week01

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun main() {
    val gameTittle = "Elden Ring"
    val price = 600000
    val discount = calculateDiscount (price)
    val finalPrice = price - discount

    printReceipt(tittle = gameTittle, finalPrice = finalPrice)
}

fun printReceipt(tittle: String, finalPrice: Int) {
    println("--- Struk Pembelian ---")
    println("Game: $tittle")
    println("Harga Akhir: Rp $finalPrice")
}
