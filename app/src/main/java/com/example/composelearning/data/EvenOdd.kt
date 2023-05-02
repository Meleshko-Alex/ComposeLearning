package com.example.composelearning.data

class EvenOdd() {
    fun check(value: Int): String {
        return if (value % 2 == 0) "even" else "odd"
    }
}