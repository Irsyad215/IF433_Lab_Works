package oop_99880_Mohamad.Irsyad.Week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG",  20,  15.5,  "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10,  -5.2,  "CLOSED"),
        TradeLog("ETHUSDT", "LONG",  15,  22.3,  "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10,  -8.7,  "CLOSED"),
        TradeLog("SOLUSDT", "LONG",  25,   9.1,  "CLOSED"),
        TradeLog("SOLUSDT", "SHORT",  5, -12.4,  "CLOSED"),
        TradeLog("BTCUSDT", "LONG",  20,   4.8,  "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 10,  -3.3,  "OPEN")
    )

    println("Total trades: ${tradeHistory.size}")
}