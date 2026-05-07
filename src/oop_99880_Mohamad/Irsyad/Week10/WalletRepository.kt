package oop_99880_Mohamad.Irsyad.Week10

class WalletRepository<T> { [cite: 106]
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }
}