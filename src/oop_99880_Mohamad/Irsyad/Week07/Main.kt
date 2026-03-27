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

    println("\n=== TEST DATA CLASS ===")
    val data1 = Datauser("Alice", 22)
    val data2 = Datauser("Alice", 22)
    println(data1)
    println("sama? ${data1 === data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (username, userAge) = data1
    println("Destructed: $username Berumur $userAge")
}