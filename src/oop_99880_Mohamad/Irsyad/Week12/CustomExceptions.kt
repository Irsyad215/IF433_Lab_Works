package oop_99880_Mohamad.Irsyad.Week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")

class BankAccount(var balance: Double) : Exception("Balance: $balance") {
    fun withdraw(amount: Double) {
        if (amount < 0) {
            throw IllegalArgumentException("Amount must be positive")
        }
        if (amount > balance) {
            throw InsufficientFundsException(amount, balance)
        }
        balance -= amount
        println("Withdrawal succesful, Remaining balance: $balance")
    }
}

fun main() {
    println("=== TEST MULTIPLE CATCH ===")
    val account1 = BankAccount(100.0)

    try {
        account1.withdraw(150.0)
    } catch (e: InsufficientFundsException) {
        println("Caught Domain Error: Uang tidak cukup: ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("Caught Argument Error: Input not valid: ${e.message}")
    } catch (e: Exception) {
        println("Caught Genera Error: Terjadi kesalahan tidak terduga")
    }
}