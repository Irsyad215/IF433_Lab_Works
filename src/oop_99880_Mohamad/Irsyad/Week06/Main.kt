package oop_99880_Mohamad.Irsyad.Week06

import oop_99880_Mohamad.Irsyad.Week05.CreditCard

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay ()
    val pay2 = CreditCard ()

    println("\n===  TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)
}
