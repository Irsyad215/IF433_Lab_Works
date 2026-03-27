package oop_99880_Mohamad.Irsyad.Week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST SINGLETON ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = Datauser("Alice", 22)
    val data2 = Datauser("Alice", 22)
    println(data1)
    println("sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (username, userAge) = data1
    println("Destructed: $username Berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik")

    val uiMessage = when (response) {
        is ApiResponse.Success -> "Tampilkan ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println("\n=== TUGAS MANDIRI: RPG CORE ENGINE ===")

    GameManager.startGame()
    GameManager.startGame()

    println("\nPeluang drop item LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val mySword = Weapon.forgeStarterSword()
    println("Senjata awal: ${mySword.item.name}, Damage: ${mySword.item.damage}, Durability: ${mySword.durability}")

    val upgradedSwordItem = mySword.item.copy(damage = 25)
    println("Senjata di-upgrade: ${upgradedSwordItem.name}, Damage Baru: ${upgradedSwordItem.damage}")

    val upgradedSwordItem = mySword.item.copy(damage = 25)
    println("Senjata di-upgrade: ${upgradedSwordItem.name}, Damage Baru: ${upgradedSwordItem.damage}")

    println("\n--- MULAI PERJALANAN ---")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedSwordItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}