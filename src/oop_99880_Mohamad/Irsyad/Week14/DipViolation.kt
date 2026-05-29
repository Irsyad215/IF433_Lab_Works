package oop_99880_Mohamad.Irsyad.Week14

class MySQLDatabase {
    fun query(sql: String): List<String> = listOf("data1", "data2")
}

class UserService {
    private val database = MySQLDatabase()  // hard-coded! tightly coupled!
    fun getUser(id: Int) = database.query("SELECT * FROM users WHERE id=$id")
}