package oop_99880_Mohamad.Irsyad.Week06

class SmartCCTV(override val id: String, override val name: String) :
    SmartDevice, Switchable, Recordable {

    override fun turnon() {
        println("[$name] Power ON.")
        startRecord()
    }

    override fun turnoff() {
        println("[$name] Power OFF.")
    }

    override fun startRecord() {
        println("[$name] Memulai perekaman video...")
    }
}