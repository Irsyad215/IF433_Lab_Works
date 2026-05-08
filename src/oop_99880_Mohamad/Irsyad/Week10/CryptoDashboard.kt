package oop_99880_Mohamad.Irsyad.Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 100.0))

    val response = ApiResponse("200 ok", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Nama Koin: ${coin.name}, Saldo: ${coin.balance}")
    }

    val rxRepo = WalletRepository<Transaction>()
    rxRepo.add(Transaction("TX001", 0.01))
    rxRepo.add(Transaction("TX002", 50.5))

    println("\nRiwayat Transaksi")
    rxRepo.getAll().forEach { println("ID: ${it.id}, jumlah: ${it.amount}") }
}