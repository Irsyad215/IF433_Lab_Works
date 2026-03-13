package oop_99880_Mohamad.Irsyad.Week06

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>,turnOn()
        super<Phone>,turnOn()
        println("Sistem operasi smartphone berhasil booting.")
    }
}