package oop_99880_Mohamad.Irsyad.Week08

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTests() {
    println("\n === RUNNING UNIT TESTS ===")
    val testUser = DatabaseMock.findUser(1)

    val initial = testUser!!.name.substring(0, 1)

    check(initial == "T") { "test Failed Initial is wrong."}
    println("Test Passed: Initial is T")
}