package com.example.calculator.calculation

import com.example.calculator.abstract.AbstractOperation

class Calculator(private val operation: AbstractOperation) {
    fun operate(num1: Int, num2: Int): Double {
        return operation.operate(num1, num2)
    }
}