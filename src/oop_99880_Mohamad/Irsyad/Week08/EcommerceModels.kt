package oop_99880_Mohamad.Irsyad.Week08

Sealed class  Product()

data class Electronic(
    val id: String,
    val Name: String,
    val WarrantyMonths: Int
) : Product()