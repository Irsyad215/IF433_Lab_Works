package oop_99880_Mohamad.Irsyad.Week07

import oop_99880_Mohamad.Irsyad.Week07.NetworkClient.Companion.BASE_URL

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST SINGLETON ===")
    val client = NetworkClient.createClient()
    client.connect

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("sama? ${reg1 === reg2}")
}