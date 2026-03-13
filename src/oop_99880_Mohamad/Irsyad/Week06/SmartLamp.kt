package oop_99880_Mohamad.Irsyad.Week06

class SmartLamp(
    overide val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnOn() {
        println("[$name] Lampu menyala dengan keceragan 80%")
    }

    override fun turnoff() {
        println("[$name] Lampu telah dimatikan")
    }
}