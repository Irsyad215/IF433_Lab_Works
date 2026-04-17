package oop_99880_Mohamad.Irsyad.Week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
    mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "Warranty" to 24),
    mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "Size" to "XL"),
    mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "Warranty" to "Not An Integer"),
    mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
    mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                when (it) {
                    is Electronic -> println("Parsed: Electronic - ${it.name} (Warranty: ${it.warrantyMonths} monnths)")
                    is Clothing -> println("Parsed: Clothing - ${it.name} (Size: ${it.size} (Size: ${it.size})")
                }
                parser.checkout(it)
            }  ?: println("Skipped: Unknown product type for data -> $raw")
        } catch (e: IllegalArgumentException) {
            println("WARNING - Corrupted data skipped: ${e.message}")
        }
    }
}