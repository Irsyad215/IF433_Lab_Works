package oop_99880_Mohamad.Irsyad.Week12

fun main() {
    println("=== TESTING RUNCATCHING ===")
    val resutl: Result<Int> = runCatching {
        "42x".toInt()
    }
}