package oop_99880_Mohamad.Irsyad.Week06

class Gopay : PaymentMethod {
    override fun pay(ammount: Double) { println("Processing Rp$ammount via gopay Server") }
}

class Credit : PaymentMethod {
    override fun pay(ammount: Double) { println("Contacting bank for Rp$ammount") }
}