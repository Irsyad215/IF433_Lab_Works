package oop_99880_Mohamad.Irsyad.Week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Transaksi Kartu Kredit Berhasil. Total Tagihan: $usedAmount")
        } else {
            println("[$accountName] Transaksi ditolak: Melebihi limit!")
        }
    }
}