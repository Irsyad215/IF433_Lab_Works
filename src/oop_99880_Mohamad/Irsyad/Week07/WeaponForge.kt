package oop_99880_Mohamad.Irsyad.Week07

class Weapon private constructor(val item: GameItem, val durability: Int) { [cite: 156]

    // Pabrik otomatis penyedia senjata [cite: 158]
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Excalibur", 150, ItemRarity.EPIC)
            return Weapon(epicItem, 200)
        }
    }
}