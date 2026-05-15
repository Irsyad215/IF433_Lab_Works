package oop_99880_Mohamad.Irsyad.Week12

fun main() {
    println("=== TESTING RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42x".toInt()
    }

    val safeValue = result.getOrElse { -1}
    println("Safe Value: $safeValue")

    val recovered = result.recover { 0}.getOrNull()
    println("Recovered Value: $recovered")

    runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Berhasil Dikonversi: $v")
    }.onFailure { e ->
        println("Gagal Konversi: ${e.message}")
    }
}