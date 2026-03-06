package oop_99880_Mohamad.Irsyad.Week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> { // Fixed: Capital 'D' for Dosen [cite: 68]
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminwork()
            }
        }
        println("______________________________")
    }

    println("\n=== TESTING MATHHELPER (OVERLOADING) ===")
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    val luasPersegiPanjang = math.hitungLuas(10, 5)
    val luasLingkaran = math.hitungLuas(7.0)

    println("Luas Persegi (s=5): $luasPersegi")
    println("Luas Persegi Panjang (10x5): $luasPersegiPanjang")
    println("Luas Lingkaran (r=7): $luasLingkaran")

    println("\n=== SISTEM PEMBAYARAN E-COMMERCE ===")

    val myWallet = EWallet("Irsyad Wallet", 50000.0)
    val myCard = CreditCard("Irsyad Card", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(myWallet, myCard)

    for (pay in paymentList) {
        println("\nMemproses pembayaran sebesar 75000.0...")
        pay.processPayment(75000.0)

        if (pay is EWallet && pay.balance < 75000.0) {
            println("=> Recovery: Saldo E-Wallet kurang. Melakukan Top Up otomatis...")
            pay.topUp(50000.0)
            pay.processPayment(75000.0)
        }
    }
}