package com.example.composelearning.data

class EvenOdd(private val isUppercase: Boolean) {
    fun check(value: Int): String {
        val result = if (value % 2 == 0) "even" else "odd"
        return if (isUppercase) result.uppercase() else result
    }
}