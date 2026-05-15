package oop_99880_Mohamad.Irsyad.Week12

class InsufficientCapacityException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")