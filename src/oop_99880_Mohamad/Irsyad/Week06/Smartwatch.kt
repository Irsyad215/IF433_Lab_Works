package oop_99880_Mohamad.Irsyad.Week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargable {
    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP disekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W ")
    }
}