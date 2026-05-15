package oop_99880_Mohamad.Irsyad.Week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50
    println("=== JADWAL MAKAN 1 (PAGI) ===")
    try {
        val sisaStok = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
        currentKibbleStock = sisaStok
        println("Stok kibble tersisa: $currentKibbleStock gr")
    } catch (e: DispenserJamException) {
        println("Hardware Error: ${e.message}")
        println("Tindakan: Hubungi teknisi untuk memperbaiki dispenser.")

    } catch (e: FoodEmptyException) {
        println("Stok Error: ${e.message}")
        println("Tindakan: Segera isi ulang wadah kibble!")

    } catch (e: Exception) {
        println("Error Tak Terduga: ${e.message}")

    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("=== JADWAL MAKAN 2 (SORE) ===")
    println("Pemilik telah mengisi ulang kibble. Stok sekarang: 1000 gr")

    runCatching {
        dispenseKibble(
            requestedGram  = 30,
            availableGram  = 1000,
            isJammed       = false
        )
    }
        .onSuccess { newStock ->
            currentKibbleStock = newStock
            println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
        }
}