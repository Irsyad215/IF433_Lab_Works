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
