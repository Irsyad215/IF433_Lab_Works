package oop_99880_Mohamad.Irsyad.Week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnon() {
        println("[$name] Sistem suara aktif, siap menerima perintah. ")
    }

    override fun turnoff() {
        println("[$name] Mematikan sistem speaker.")
    }

    fun playMusic(song: String) {
        println("[$name] Memutar lagu $song dari spotify")
    }
}