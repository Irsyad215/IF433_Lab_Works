package oop_99880_Mohamad.Irsyad.Week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    // Ubah huruf 'O' besar menjadi 'o' kecil di sini
    override fun turnon() {
        println("[$name] Lampu menyala dengan kecerahan 80%")
    }

    override fun turnoff() {
        println("[$name] Lampu telah dimatikan")
    }
}