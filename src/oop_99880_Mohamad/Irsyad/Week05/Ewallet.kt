package oop_99880_Mohamad.Irsyad.Week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran E-Wallet berhasil. Sisa saldo: $balance")
        } else {
            println("[$accountName] Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top Up berhasil sebesar $amount. Saldo sekarang: $balance")
    }
}