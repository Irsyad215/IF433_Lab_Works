package oop_99880_Mohamad.Irsyad.Week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST SINGLETON ===")
    val client = NetworkClient.createClient()
    client.connect
}