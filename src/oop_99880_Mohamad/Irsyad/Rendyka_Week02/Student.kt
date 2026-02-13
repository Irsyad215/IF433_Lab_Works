package oop_99880_Mohamad.Irsyad.Rendyka_Week02

class Student (
    val name: String ,
    val nim: String,
    var gpa: Double = 0.0,
    var major: String
) {
    init {
        if (nim.length != 5) {
            println("WARNING, objek tercipta dengan NIM ($nim) tang tidak valid")
            println("data mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("LOG: Objek student $name berhasil berkolaborasi di Memory")
        }
    }
    constructor(name: String, nim: String) : this(name, nim, major = "Non-Matriculated") {
        println("LOG: Menggunakan Constructor jalur umum (tanpa jurusan). ")
    }
}



