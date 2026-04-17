package oop_99880_Mohamad.Irsyad.Week08

class ApiParser {

    fun parseProduct(rawJason: Map<String, Any>): Product? {
        val id = requireNotNull(rawJason["id"] as? String) {
            "API Invalid: Missing ID"
        }
        val name = requireNotNull(rawJason["name"] as? String) {
            "API Invalid: Missing Name"
        }

        val type = rawJason["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJason["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJason["size"] as? String ?: "ALL Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) { //Checkout method implemented
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }
        val transactionId = JavaPaymentService.ProccesPayment(id)!!
        println("Payment Success!! Transaction id: $transactionId")
    }
}