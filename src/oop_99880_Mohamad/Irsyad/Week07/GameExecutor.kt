package oop_99880_Mohamad.Irsyad.Week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("AWAS! Monster ${event.monsterName} muncul!")
        is BattleState.LootDropped -> {
            val (itemName, itemDamage, itemRarity) = event.item
            println("Hore! Kamu mendapat loot: $itemName [$itemRarity] dengan damage $itemDamage")
        }
        is BattleState.GameOver -> println("GAME OVER: ${event.reason}")
        BattleState.SafeZone -> println("Kamu memasuki zona aman. Silakan istirahat.")
    }
}