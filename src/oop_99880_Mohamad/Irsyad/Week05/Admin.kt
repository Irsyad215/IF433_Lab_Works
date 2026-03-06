package oop_99880_Mohamad.Irsyad.Week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

    fun doAdminwork() {
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}