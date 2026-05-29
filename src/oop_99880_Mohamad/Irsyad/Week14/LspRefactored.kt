package oop_99880_Mohamad.Irsyad.Week14

interface Shape {
    fun area(): Int
}

class SafeRectangle(var width: Int, var height: Int) : Shape {
    override fun area() = width * height
}

class SafeSquare(var side: Int) : Shape {
    override fun area() = side * side
}

fun main() {
    val shapes: List<Shape> = listOf(SafeRectangle(4, 5), SafeSquare(3))
    shapes.forEach { println("Area: ${it.area()}") }
}