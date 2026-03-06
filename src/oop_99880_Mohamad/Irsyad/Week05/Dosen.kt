package oop_99880_Mohamad.Irsyad.Week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama)  {
    override fun bekerja() {
        println("[$nama] Sedang menyiapkan materi perkuliahan dan merevisi BPKPS.")
    }

    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas" )
    }
}