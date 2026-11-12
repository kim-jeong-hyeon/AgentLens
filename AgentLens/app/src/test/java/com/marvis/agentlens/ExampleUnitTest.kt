package com.marvis.agentlens

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        //test example unit add
        assertEquals(4, 2 + 2)
    }


  //further example test cases
    @Test
    fun subtraction_isCorrect() {
        assertEquals(3, 10 - 7)
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(12, 3 * 4)
    }

    @Test
    fun division_isCorrect() {
        assertEquals(5, 20 / 4)
        assertEquals(2.5, 5.0 / 2.0, 0.0001)
    }

    @Test
    fun string_concatenation_isCorrect() {
        val greeting = "Hello, " + "AgentLens"
        assertEquals("Hello, AgentLens", greeting)
        assertTrue(greeting.startsWith("Hello"))
    }

    @Test
    fun list_operations_areCorrect() {
        val numbers = listOf(1, 2, 3, 4, 5)
        assertEquals(15, numbers.sum())
        assertEquals(listOf(2, 4), numbers.filter { it % 2 == 0 })
        assertEquals(5, numbers.size)
    }

    @Test
    fun map_lookup_isCorrect() {
        val scores = mapOf("a" to 1, "b" to 2)
        assertEquals(2, scores["b"])
        assertNull(scores["z"])
    }
}
