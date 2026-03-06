package oop_99880_Mohamad.Irsyad.Week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}