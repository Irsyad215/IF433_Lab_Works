package oop_99880_Mohamad.Irsyad.Week14

interface Database {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {
    override fun query(sql: String) = listOf("pg_data1", "pg_data2")
}

class MySQLDatabaseSafe : Database {
    override fun query(sql: String) = listOf("mysql_data1", "mysql_data2")
}

class SafeUserService(private val db: Database) {
    fun getUser(id: Int) = db.query("SELECT * FROM users WHERE id=$id")
}

fun main() {
    val service = SafeUserService(PostgresDatabase())
    println(service.getUser(1))
}