package oop_99880_Mohamad.Irsyad.Week06

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Phone>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi smartphone berhasil booting.")
    }
}