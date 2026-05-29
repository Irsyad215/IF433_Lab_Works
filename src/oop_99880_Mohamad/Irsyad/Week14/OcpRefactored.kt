package oop_99880_Mohamad.Irsyad.Week14

interface DiscountStrategy {
    fun apply(price: Double): Double
}

class StudentDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.80
}

class MemberDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.85
}

class SafeDiscountCalculator(private val strategy: DiscountStrategy) {
    fun calculate(price: Double) = strategy.apply(price)
}

class SeniorDiscount : DiscountStrategy {
    override fun apply(price: Double) = price * 0.75
}

fun main() {
    val studentCalc = SafeDiscountCalculator(StudentDiscount())
    val seniorCalc  = SafeDiscountCalculator(SeniorDiscount())
    println("Student price: ${studentCalc.calculate(100.0)}")  // 80.0
    println("Senior price:  ${seniorCalc.calculate(100.0)}")   // 75.0
}