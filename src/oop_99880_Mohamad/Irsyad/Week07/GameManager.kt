package oop_99880_Mohamad.Irsyad.Week07

object GameManager {
    var isGameRunning: Boolean = false // Menyimpan status game [cite: 138]

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        } else {
            isGameRunning = true
            println("Memulai Game Engine...")
        }
    }
}