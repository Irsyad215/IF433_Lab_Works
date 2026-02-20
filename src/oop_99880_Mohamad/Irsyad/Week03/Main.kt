package oop_99880_Mohamad.Irsyad.Week03

fun main() {
    val sword = Weapon("Excalibur")
    sword.damage = -50
    sword.damage = 9999
    println("Weapon: ${sword.name}, Damage: ${sword.damage}, Tier: ${sword.tier}")

    val player = Player("Irsyad_Pro")

}