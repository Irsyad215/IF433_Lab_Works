package oop_99880_Mohamad.Irsyad.Week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to: $url")
    }
}