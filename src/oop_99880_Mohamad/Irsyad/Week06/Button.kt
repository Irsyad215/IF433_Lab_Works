package oop_99880_Mohamad.Irsyad.Week06

class Button(override  val name: String) : Clickable {
    override fun click() {
        println("tombol '$name' Berhasil diklik!")
    }
}